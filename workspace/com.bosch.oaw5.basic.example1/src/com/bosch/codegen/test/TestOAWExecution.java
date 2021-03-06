package com.bosch.codegen.test;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import metamodel.MetamodelPackage;
import metamodel.Type;
import metamodel.impl.ModelImpl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.mwe.core.monitor.NullProgressMonitor;
import org.eclipse.emf.mwe.core.resources.CachingResourceLoaderImpl;
import org.eclipse.emf.mwe.core.resources.ResourceLoader;
import org.eclipse.emf.mwe.core.resources.ResourceLoaderFactory;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xtend.expression.ResourceManager;
import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;


public class TestOAWExecution {

  private static final String TEMPLATES_DIRECTORY="input\\templates";
  
  private static final String OUTPUT_DIRECTORY="output";
  
  private static final String DATA_MODEL_XMI="input\\model\\Model.xmi";

  public static void main(String[] args) {

    EmfRegistryMetaModel metamodel = new EmfRegistryMetaModel() {
      @Override
      protected EPackage[] allPackages() {
        return new EPackage[] { MetamodelPackage.eINSTANCE, EcorePackage.eINSTANCE };
      }
    };
    Object dataModel = populateModel();

    long startTime = System.currentTimeMillis();

    /*==============================================================================================================*/
    
    ResourceManager resourceManager = CustomResourceManager.getInstance();

    CustomResourceLoader basisResourceLoader = new CustomResourceLoader(new File(TEMPLATES_DIRECTORY));

    ResourceLoader previousResourceLoader = ResourceLoaderFactory.getCurrentThreadResourceLoader();

    ResourceLoader resourceLoader = new CachingResourceLoaderImpl(basisResourceLoader);
    try {
      ResourceLoaderFactory.setCurrentThreadResourceLoader(resourceLoader);

      OutputImpl output = getOutput();
      
      
      XpandExecutionContextImpl context =
          new XpandExecutionContextImpl(resourceManager, output, null, null, new NullProgressMonitor(),
              null, null, null);


      context.registerMetaModel(metamodel);

      XpandFacade xpandFacade = XpandFacade.create(context);


      xpandFacade.evaluate("Template::main", dataModel, new Object[] {});
      
      
    }catch (Exception e) {
      // TODO: handle exception
      e.printStackTrace();
    }finally{
      ResourceLoaderFactory.setCurrentThreadResourceLoader(previousResourceLoader);
    }
  
    System.out.println("Total time taken is: "+(System.currentTimeMillis()-startTime));
  }

  /**
   * @return
   */
  private static OutputImpl getOutput() {
    OutputImpl output = new OutputImpl();
    Outlet outlet = new Outlet(OUTPUT_DIRECTORY);
    outlet.setOverwrite(true);
    output.addOutlet(outlet);
    return output;
  }

  @SuppressWarnings("javadoc")
  public static Object populateModel(){ 


    // Create a resource set to hold the resources.
    //
    ResourceSet resourceSet = new ResourceSetImpl();

    // Register the appropriate resource factory to handle all file extensions.
    //
    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
    (Resource.Factory.Registry.DEFAULT_EXTENSION, 
        new XMIResourceFactoryImpl());

    // Register the package to ensure it is available during loading.
    //
    resourceSet.getPackageRegistry().put
    (MetamodelPackage.eNS_URI, 
        MetamodelPackage.eINSTANCE);


    String path=DATA_MODEL_XMI;
    File file = new File(path);

    URI uri = URI.createFileURI(file.getAbsolutePath());

    Resource resource = resourceSet.getResource(uri, true);

    EObject object = resource.getContents().get(0);
    
    if(object instanceof ModelImpl){
      
      EList<Type> types = ((ModelImpl)object).getTypes();
      
      
      List<Type> clonedElements=new ArrayList<Type>();
      
      int j=0;
      
      for (Type type : types) {

        for(int i=0;i<500;i++){
          Type clone = EcoreUtil.copy(type);
          
          clone.setName(clone.getName()+""+ ++j);
          
          clonedElements.add(clone);
          
          
        }
      }
      
      types.addAll(clonedElements);
    }
    
    return object;
  
  }
}
