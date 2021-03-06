package com.bosch.codegen.test;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xtend.typesystem.emf.EmfRegistryMetaModel;

import metamodel.MetamodelPackage;
import metamodel.impl.ModelImpl;

public class TestOAWExecution {

	public static void main(String[] args) {

		String expectedParams = "Supply 3 input arguments ; <CPPModel file path> <Output directory path> <MultiTest true/false>";

		if (args.length < 3) {
			System.out.println(expectedParams);

			System.out.println("As all the arguments are not supplied, can not continue further");

			return;
		}

		String DATA_MODEL_XMI = args[0];
		String OUTPUT_DIRECTORY = args[1];
		Boolean MULTIFILE = new Boolean(args[2]);

		Object dataModel = populateModel(DATA_MODEL_XMI);

		if(dataModel!=null) {
			System.out.println("Loaded input cpp model successfully ");
		}
		CodeGen codeGen = new CodeGen();

		try {
			if (!MULTIFILE) {
				codeGen.writeSingeTestFile(dataModel, OUTPUT_DIRECTORY);
			} else {
				codeGen.writeMultipleTestFile(dataModel, OUTPUT_DIRECTORY);
			}
			
			System.out.println("Successfully generated files !!");
		}catch (Exception e) {
			System.out.println("Error occured while generating test case files");
		}

	}

	public static Object populateModel(String DATA_MODEL_XMI) {

		// Create a resource set to hold the resources.
		//
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the appropriate resource factory to handle all file extensions.
		//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		// Register the package to ensure it is available during loading.
		//
		resourceSet.getPackageRegistry().put(MetamodelPackage.eNS_URI, MetamodelPackage.eINSTANCE);

		String path = DATA_MODEL_XMI;
		File file = new File(path);

		URI uri = URI.createFileURI(file.getAbsolutePath());

		Resource resource = resourceSet.getResource(uri, true);

		EObject object = resource.getContents().get(0);

		if (object instanceof ModelImpl) {
			return object;
		}

		return null;

	}
}
