package com.bosch.codegen.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import metamodel.ClassElement;
import metamodel.GlobalVariable;
import metamodel.MemberFunction;
import metamodel.Model;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class CodeGen {
  public void writeSingeTestFile(final Object obj, final String outputDirectory) {
    this.writeContent(((outputDirectory + File.separator) + "cpp.test"), this.main(obj).toString());
  }
  
  protected void writeContent(final String filePath, final String content) {
    try {
      File _file = new File(filePath);
      FileWriter _fileWriter = new FileWriter(_file);
      final BufferedWriter bw = new BufferedWriter(_fileWriter);
      bw.write(content);
      bw.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void writeMultipleTestFile(final Object obj, final String outputDirectory) {
    if ((obj instanceof Model)) {
      EList<ClassElement> _classesList = ((Model)obj).getClassesList();
      for (final ClassElement classObj : _classesList) {
        String _name = classObj.getName();
        String _plus = ((outputDirectory + File.separator) + _name);
        String _plus_1 = (_plus + "_cpp.test");
        this.writeContent(_plus_1, this.generateClassContent(classObj).toString());
      }
    }
  }
  
  public CharSequence main(final Object obj) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    {
      if ((obj instanceof Model)) {
        _builder.newLine();
        {
          EList<ClassElement> _classesList = ((Model) obj).getClassesList();
          for(final ClassElement classObj : _classesList) {
            _builder.newLine();
            _builder.append("\t");
            CharSequence _generateClassContent = this.generateClassContent(classObj);
            _builder.append(_generateClassContent, "\t");
            _builder.append("\t");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          }
        }
        _builder.newLine();
      }
    }
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence generateClassContent(final ClassElement classObj) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("This file is generated by Meer");
    _builder.newLine();
    _builder.append("Name of the class is:\t");
    String _name = classObj.getName();
    _builder.append(_name);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/************ GLOBAL VARIABLE DETAILS **************/");
    _builder.newLine();
    {
      EList<GlobalVariable> _globalVariableDefs = classObj.getGlobalVariableDefs();
      for(final GlobalVariable globalVariable : _globalVariableDefs) {
        _builder.append("\t");
        _builder.append("Gloabl variable : ");
        String _name_1 = globalVariable.getName();
        _builder.append(_name_1, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("/********** MEMBER FUNCTION DETAILS *******************/");
    _builder.newLine();
    {
      EList<MemberFunction> _memberFunctions = classObj.getMemberFunctions();
      for(final MemberFunction memberFunction : _memberFunctions) {
        _builder.append("\t");
        _builder.append("Function : ");
        String _name_2 = memberFunction.getName();
        _builder.append(_name_2, "\t");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
      }
    }
    return _builder;
  }
}