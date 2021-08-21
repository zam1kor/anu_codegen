package com.bosch.codegen.test;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.emf.mwe.core.resources.ResourceLoaderDefaultImpl;

/**
 * Resource loader to load filesystem resources.
 */
public class CustomResourceLoader extends ResourceLoaderDefaultImpl {

  private final File resourceDir;

  private static final String EXTENSION_XPT = ".xpt";
  private static final String EXTENSION_EXT = ".ext";
  private static final String EXTENSION_CHK = ".chk";
  private static final String EXTENSION_OAW = ".oaw";
  private static final String EXTENSION_PROPERTIES = ".properties";

  /**
   * Creates an instance initialised with the given directory.
   * 
   * @param resourceDir directory in which resources are present. Value must not be null and should be a valid
   *          directory.
   */
  public CustomResourceLoader(final File resourceDir) {
    Assert.isNotNull(resourceDir, "resourceDir");
    Assert.isTrue(resourceDir.isDirectory(), "resourceDir should be a directory");
    this.resourceDir = resourceDir;
  }

  /**
   * Checks if this loader can handle loading the resource.
   * 
   * @param path path of the resource
   * @return true if the resource can be handled, or false
   */
  private boolean canHandle(final String path) {
    return (path.endsWith(EXTENSION_XPT) || path.endsWith(EXTENSION_EXT) || path.endsWith(EXTENSION_CHK) ||
        path.endsWith(EXTENSION_OAW) || path.endsWith(EXTENSION_PROPERTIES));
  }

  /**
   * Checks if this loader can load the resource. This loader can load if the resource is found under the directory.
   * 
   * @param path path of the resource
   * @return true if the resource can be loaded, or false
   * @see #TemplateResourceLoader(File)
   */
  private boolean canLoad(final String path) {
    if (canHandle(path)) {
      String resourceName = new File(path).getName();
      List<String> availableResources = Arrays.asList(this.resourceDir.list());
      return availableResources.contains(resourceName);
    }
    return false;
  }

  @Override
  protected URL loadFromContextClassLoader(final String path) {
    if (canLoad(path)) {
      File resource = new File(path);
      if (!resource.isAbsolute()) {
        resource = new File(this.resourceDir, new File(path).getName());
      }

      try {
        URI uri = resource.toURI();
        return uri.toURL();
      }
      catch (MalformedURLException e) {
        throw new RuntimeException(e);
      }
    }

    return super.loadFromContextClassLoader(path);

  }
}
