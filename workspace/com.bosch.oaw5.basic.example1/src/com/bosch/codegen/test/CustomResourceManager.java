package com.bosch.codegen.test;
/*
 * Copyright (c) Robert Bosch GmbH. All rights reserved.
 */


import java.io.Reader;

import org.eclipse.internal.xpand2.XpandUtil;
import org.eclipse.internal.xpand2.parser.XpandParseFacade;
import org.eclipse.xtend.expression.Resource;
import org.eclipse.xtend.expression.ResourceManager;
import org.eclipse.xtend.expression.ResourceManagerDefaultImpl;
import org.eclipse.xtend.expression.ResourceParser;


/**
 * @author eze2si
 */
public class CustomResourceManager {

  private CustomResourceManager() {

  }

  private static ResourceManager oawResourceManager;

  /**
   * @return
   */
  public static ResourceManager getInstance() {

    if (oawResourceManager == null) {
      oawResourceManager = new ResourceManagerDefaultImpl();
      oawResourceManager.registerParser(XpandUtil.TEMPLATE_EXTENSION, new ResourceParser() {

        public Resource parse(final Reader in, final String fileName) {
          return XpandParseFacade.file(in, fileName);
        }
      });
    }
    return oawResourceManager;

  }
}
