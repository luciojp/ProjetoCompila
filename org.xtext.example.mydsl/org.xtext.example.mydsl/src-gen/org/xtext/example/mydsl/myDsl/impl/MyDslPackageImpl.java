/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.example.mydsl.myDsl.Ampersand_Rule;
import org.xtext.example.mydsl.myDsl.Arg_List;
import org.xtext.example.mydsl.myDsl.Array_initializer;
import org.xtext.example.mydsl.myDsl.Bit_Expression_NR;
import org.xtext.example.mydsl.myDsl.Cast_Expression;
import org.xtext.example.mydsl.myDsl.Class_declaration;
import org.xtext.example.mydsl.myDsl.Compilation_unit;
import org.xtext.example.mydsl.myDsl.Constructor_declaration;
import org.xtext.example.mydsl.myDsl.Creating_Expression;
import org.xtext.example.mydsl.myDsl.Do_Statement;
import org.xtext.example.mydsl.myDsl.Expression;
import org.xtext.example.mydsl.myDsl.Expression_aux;
import org.xtext.example.mydsl.myDsl.Field_declaration;
import org.xtext.example.mydsl.myDsl.Float_Literal;
import org.xtext.example.mydsl.myDsl.For_Statement;
import org.xtext.example.mydsl.myDsl.If_statement;
import org.xtext.example.mydsl.myDsl.Import_statement;
import org.xtext.example.mydsl.myDsl.Interface_declaration;
import org.xtext.example.mydsl.myDsl.Literal_Expression;
import org.xtext.example.mydsl.myDsl.Logical_Expression_NR;
import org.xtext.example.mydsl.myDsl.Method_declaration;
import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.MyDslFactory;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Numeric_Expression_NR;
import org.xtext.example.mydsl.myDsl.Package_statement;
import org.xtext.example.mydsl.myDsl.Parameter;
import org.xtext.example.mydsl.myDsl.Parameter_list;
import org.xtext.example.mydsl.myDsl.Statement;
import org.xtext.example.mydsl.myDsl.Statement_block;
import org.xtext.example.mydsl.myDsl.Static_initializer;
import org.xtext.example.mydsl.myDsl.Switch_statement;
import org.xtext.example.mydsl.myDsl.Try_statement;
import org.xtext.example.mydsl.myDsl.Type;
import org.xtext.example.mydsl.myDsl.Type_declaration;
import org.xtext.example.mydsl.myDsl.Type_specifier;
import org.xtext.example.mydsl.myDsl.Variable_declaration;
import org.xtext.example.mydsl.myDsl.Variable_declarator;
import org.xtext.example.mydsl.myDsl.Variable_initializer;
import org.xtext.example.mydsl.myDsl.While_Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslPackageImpl extends EPackageImpl implements MyDslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compilation_unitEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass type_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass interface_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass class_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass field_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass method_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constructor_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameter_listEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variable_declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variable_declaratorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass variable_initializerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass array_initializerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass type_specifierEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass static_initializerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statement_blockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass for_StatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expression_auxEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ampersand_RuleEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass float_LiteralEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literal_ExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass creating_ExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cast_ExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass bit_Expression_NREClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logical_Expression_NREClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arg_ListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass numeric_Expression_NREClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass switch_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass while_StatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass do_StatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass if_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass try_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass import_statementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass package_statementEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MyDslPackageImpl()
  {
    super(eNS_URI, MyDslFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link MyDslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MyDslPackage init()
  {
    if (isInited) return (MyDslPackage)EPackage.Registry.INSTANCE.getEPackage(MyDslPackage.eNS_URI);

    // Obtain or create and register package
    MyDslPackageImpl theMyDslPackage = (MyDslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MyDslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MyDslPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theMyDslPackage.createPackageContents();

    // Initialize created meta-data
    theMyDslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMyDslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MyDslPackage.eNS_URI, theMyDslPackage);
    return theMyDslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModel_Greetings()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompilation_unit()
  {
    return compilation_unitEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompilation_unit_Name()
  {
    return (EReference)compilation_unitEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompilation_unit_Imports()
  {
    return (EReference)compilation_unitEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCompilation_unit_TypeDeclarations()
  {
    return (EReference)compilation_unitEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType_declaration()
  {
    return type_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_declaration_Comment()
  {
    return (EAttribute)type_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_declaration_ClassDec()
  {
    return (EReference)type_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_declaration_InterfaceDec()
  {
    return (EReference)type_declarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInterface_declaration()
  {
    return interface_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterface_declaration_Modifiers()
  {
    return (EAttribute)interface_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterface_declaration_InterfaceName()
  {
    return (EAttribute)interface_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterface_declaration_InterfaceHerdada()
  {
    return (EAttribute)interface_declarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInterface_declaration_InterfacesHerdadas()
  {
    return (EAttribute)interface_declarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInterface_declaration_FieldsDeclaration()
  {
    return (EReference)interface_declarationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClass_declaration()
  {
    return class_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClass_declaration_Modifiers()
  {
    return (EAttribute)class_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClass_declaration_ClassName()
  {
    return (EAttribute)class_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClass_declaration_ClassHerdada()
  {
    return (EAttribute)class_declarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClass_declaration_InterfaceImplementada()
  {
    return (EAttribute)class_declarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClass_declaration_InterfacesImplementadas()
  {
    return (EAttribute)class_declarationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClass_declaration_FieldsDeclaration()
  {
    return (EReference)class_declarationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getField_declaration()
  {
    return field_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getField_declaration_Comment()
  {
    return (EAttribute)field_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getField_declaration_VariableDeclaration()
  {
    return (EReference)field_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getField_declaration_ContructorName()
  {
    return (EReference)field_declarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getField_declaration_MethodName()
  {
    return (EReference)field_declarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getField_declaration_Staticinitializer()
  {
    return (EReference)field_declarationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethod_declaration()
  {
    return method_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethod_declaration_ModifiersMethod()
  {
    return (EAttribute)method_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_declaration_TypeMethod()
  {
    return (EReference)method_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethod_declaration_NameMethod()
  {
    return (EAttribute)method_declarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethod_declaration_LParen()
  {
    return (EAttribute)method_declarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_declaration_ParameterListMethod()
  {
    return (EReference)method_declarationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethod_declaration_Rparent()
  {
    return (EAttribute)method_declarationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethod_declaration_StatementMethod()
  {
    return (EReference)method_declarationEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMethod_declaration_Debug()
  {
    return (EAttribute)method_declarationEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstructor_declaration()
  {
    return constructor_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstructor_declaration_ModifiersConstructor()
  {
    return (EAttribute)constructor_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstructor_declaration_NameConstructor()
  {
    return (EAttribute)constructor_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstructor_declaration_LParen()
  {
    return (EAttribute)constructor_declarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstructor_declaration_ParameterListConstructor()
  {
    return (EReference)constructor_declarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstructor_declaration_Rparent()
  {
    return (EAttribute)constructor_declarationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstructor_declaration_StatementConstructor()
  {
    return (EReference)constructor_declarationEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter_list()
  {
    return parameter_listEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_list_Parameter()
  {
    return (EReference)parameter_listEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_list_Parameters()
  {
    return (EReference)parameter_listEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameter()
  {
    return parameterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameter_Type()
  {
    return (EReference)parameterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getParameter_ParameterName()
  {
    return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariable_declaration()
  {
    return variable_declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_declaration_ModifiersVariable()
  {
    return (EAttribute)variable_declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariable_declaration_Type()
  {
    return (EReference)variable_declarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariable_declaration_NameVariable()
  {
    return (EReference)variable_declarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariable_declaration_Names()
  {
    return (EReference)variable_declarationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariable_declarator()
  {
    return variable_declaratorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_declarator_NameVariable()
  {
    return (EAttribute)variable_declaratorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVariable_declarator_LenVector()
  {
    return (EAttribute)variable_declaratorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariable_declarator_Vari()
  {
    return (EReference)variable_declaratorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVariable_initializer()
  {
    return variable_initializerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariable_initializer_Array_init()
  {
    return (EReference)variable_initializerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVariable_initializer_Expression()
  {
    return (EReference)variable_initializerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArray_initializer()
  {
    return array_initializerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArray_initializer_Variableinitializer()
  {
    return (EReference)array_initializerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getType_TypeSpecifier()
  {
    return (EReference)typeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_TypeVector()
  {
    return (EAttribute)typeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getType_specifier()
  {
    return type_specifierEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_specifier_PrimitiveType()
  {
    return (EAttribute)type_specifierEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getType_specifier_ClassName()
  {
    return (EAttribute)type_specifierEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatic_initializer()
  {
    return static_initializerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatic_initializer_Static()
  {
    return (EAttribute)static_initializerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatic_initializer_Name()
  {
    return (EReference)static_initializerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement_block()
  {
    return statement_blockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatement_block_RCurly()
  {
    return (EAttribute)statement_blockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_block_Statments()
  {
    return (EReference)statement_blockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatement_block_LCurly()
  {
    return (EAttribute)statement_blockEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStatement()
  {
    return statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_VariableDeclaration()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_ExpressionStatement()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatement_G()
  {
    return (EAttribute)statementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_IfStatement()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_DoStatement()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_WhileStatement()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_ForStatement()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_SwitchStatement()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_Expression()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatement_Rparent()
  {
    return (EAttribute)statementEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_SyncStatement()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatement_Ret()
  {
    return (EAttribute)statementEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_StatementBlock()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_TryStatement()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatement_NameStatement()
  {
    return (EAttribute)statementEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStatement_Statement()
  {
    return (EReference)statementEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStatement_Name()
  {
    return (EAttribute)statementEClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFor_Statement()
  {
    return for_StatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFor_Statement_Variable()
  {
    return (EReference)for_StatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFor_Statement_Expression()
  {
    return (EReference)for_StatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFor_Statement_Expression2()
  {
    return (EReference)for_StatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFor_Statement_Expression3()
  {
    return (EReference)for_StatementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFor_Statement_Statement()
  {
    return (EReference)for_StatementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression()
  {
    return expressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_NumericExpression3()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_Aux()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_LogicalExpression()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_BitExpression()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_CastExpression()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_CreatingExpression()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_LiteralExpression()
  {
    return (EReference)expressionEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_Null()
  {
    return (EAttribute)expressionEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_Super()
  {
    return (EAttribute)expressionEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_This()
  {
    return (EAttribute)expressionEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_Name()
  {
    return (EAttribute)expressionEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExpression_aux()
  {
    return expression_auxEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_aux_ArgList()
  {
    return (EReference)expression_auxEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_aux_Aux()
  {
    return (EReference)expression_auxEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_aux_Expression2()
  {
    return (EReference)expression_auxEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_aux_ExpressionComma()
  {
    return (EReference)expression_auxEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_aux_Name()
  {
    return (EAttribute)expression_auxEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_aux_Sgin()
  {
    return (EAttribute)expression_auxEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_aux_NumericSign()
  {
    return (EAttribute)expression_auxEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_aux_Exp2()
  {
    return (EReference)expression_auxEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_aux_TestingSign()
  {
    return (EAttribute)expression_auxEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_aux_Exp1()
  {
    return (EReference)expression_auxEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_aux_LogicalSign()
  {
    return (EAttribute)expression_auxEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_aux_Ampersand()
  {
    return (EReference)expression_auxEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_aux_StringSign()
  {
    return (EAttribute)expression_auxEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_aux_BitSign()
  {
    return (EAttribute)expression_auxEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_aux_ExpressionBit()
  {
    return (EReference)expression_auxEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExpression_aux_LogicOp()
  {
    return (EAttribute)expression_auxEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExpression_aux_LogicExp()
  {
    return (EReference)expression_auxEClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAmpersand_Rule()
  {
    return ampersand_RuleEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAmpersand_Rule_A1()
  {
    return (EAttribute)ampersand_RuleEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAmpersand_Rule_A2()
  {
    return (EAttribute)ampersand_RuleEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFloat_Literal()
  {
    return float_LiteralEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFloat_Literal_DecimalDigits1()
  {
    return (EAttribute)float_LiteralEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFloat_Literal_DecimalDigits2()
  {
    return (EAttribute)float_LiteralEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFloat_Literal_Exp()
  {
    return (EAttribute)float_LiteralEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFloat_Literal_FloatTypeSufix()
  {
    return (EAttribute)float_LiteralEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteral_Expression()
  {
    return literal_ExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteral_Expression_Exp()
  {
    return (EAttribute)literal_ExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteral_Expression_Exp1()
  {
    return (EAttribute)literal_ExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLiteral_Expression_Exp2()
  {
    return (EReference)literal_ExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteral_Expression_String()
  {
    return (EAttribute)literal_ExpressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteral_Expression_CharLit()
  {
    return (EAttribute)literal_ExpressionEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCreating_Expression()
  {
    return creating_ExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCreating_Expression_ClassName()
  {
    return (EAttribute)creating_ExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreating_Expression_ArgList()
  {
    return (EReference)creating_ExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreating_Expression_TypeSpecifier()
  {
    return (EReference)creating_ExpressionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCreating_Expression_Expression()
  {
    return (EReference)creating_ExpressionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCast_Expression()
  {
    return cast_ExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCast_Expression_Type()
  {
    return (EReference)cast_ExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCast_Expression_Expression()
  {
    return (EReference)cast_ExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBit_Expression_NR()
  {
    return bit_Expression_NREClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBit_Expression_NR_Expression()
  {
    return (EReference)bit_Expression_NREClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLogical_Expression_NR()
  {
    return logical_Expression_NREClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLogical_Expression_NR_Exclamation()
  {
    return (EAttribute)logical_Expression_NREClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLogical_Expression_NR_Expression()
  {
    return (EReference)logical_Expression_NREClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLogical_Expression_NR_True()
  {
    return (EAttribute)logical_Expression_NREClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLogical_Expression_NR_False()
  {
    return (EAttribute)logical_Expression_NREClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArg_List()
  {
    return arg_ListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArg_List_Expression()
  {
    return (EReference)arg_ListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getArg_List_Expressions()
  {
    return (EReference)arg_ListEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNumeric_Expression_NR()
  {
    return numeric_Expression_NREClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNumeric_Expression_NR_Sinal_numeric()
  {
    return (EAttribute)numeric_Expression_NREClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNumeric_Expression_NR_Expression()
  {
    return (EReference)numeric_Expression_NREClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSwitch_statement()
  {
    return switch_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSwitch_statement_LParen()
  {
    return (EAttribute)switch_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitch_statement_Expression()
  {
    return (EReference)switch_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSwitch_statement_Rparent()
  {
    return (EAttribute)switch_statementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitch_statement_Expression2()
  {
    return (EReference)switch_statementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitch_statement_SwitchStatements()
  {
    return (EReference)switch_statementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWhile_Statement()
  {
    return while_StatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhile_Statement_Expression()
  {
    return (EReference)while_StatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWhile_Statement_Rparent()
  {
    return (EAttribute)while_StatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getWhile_Statement_WhileStatement()
  {
    return (EReference)while_StatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDo_Statement()
  {
    return do_StatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDo_Statement_DoStatement()
  {
    return (EReference)do_StatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDo_Statement_Lparent()
  {
    return (EAttribute)do_StatementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDo_Statement_Rparent()
  {
    return (EAttribute)do_StatementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIf_statement()
  {
    return if_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIf_statement_Lparen()
  {
    return (EAttribute)if_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIf_statement_Expression()
  {
    return (EReference)if_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIf_statement_Rparent()
  {
    return (EAttribute)if_statementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIf_statement_IdStatement()
  {
    return (EReference)if_statementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIf_statement_ElseStatement()
  {
    return (EReference)if_statementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTry_statement()
  {
    return try_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTry_statement_TryStatement()
  {
    return (EReference)try_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTry_statement_LParen()
  {
    return (EAttribute)try_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTry_statement_Parameters()
  {
    return (EReference)try_statementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTry_statement_Rparent()
  {
    return (EAttribute)try_statementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTry_statement_CatchStatement()
  {
    return (EReference)try_statementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTry_statement_FinallyStatement()
  {
    return (EReference)try_statementEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImport_statement()
  {
    return import_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_statement_ClassName()
  {
    return (EAttribute)import_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImport_statement_PacName()
  {
    return (EAttribute)import_statementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPackage_statement()
  {
    return package_statementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPackage_statement_PacName()
  {
    return (EAttribute)package_statementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslFactory getMyDslFactory()
  {
    return (MyDslFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__GREETINGS);

    compilation_unitEClass = createEClass(COMPILATION_UNIT);
    createEReference(compilation_unitEClass, COMPILATION_UNIT__NAME);
    createEReference(compilation_unitEClass, COMPILATION_UNIT__IMPORTS);
    createEReference(compilation_unitEClass, COMPILATION_UNIT__TYPE_DECLARATIONS);

    type_declarationEClass = createEClass(TYPE_DECLARATION);
    createEAttribute(type_declarationEClass, TYPE_DECLARATION__COMMENT);
    createEReference(type_declarationEClass, TYPE_DECLARATION__CLASS_DEC);
    createEReference(type_declarationEClass, TYPE_DECLARATION__INTERFACE_DEC);

    interface_declarationEClass = createEClass(INTERFACE_DECLARATION);
    createEAttribute(interface_declarationEClass, INTERFACE_DECLARATION__MODIFIERS);
    createEAttribute(interface_declarationEClass, INTERFACE_DECLARATION__INTERFACE_NAME);
    createEAttribute(interface_declarationEClass, INTERFACE_DECLARATION__INTERFACE_HERDADA);
    createEAttribute(interface_declarationEClass, INTERFACE_DECLARATION__INTERFACES_HERDADAS);
    createEReference(interface_declarationEClass, INTERFACE_DECLARATION__FIELDS_DECLARATION);

    class_declarationEClass = createEClass(CLASS_DECLARATION);
    createEAttribute(class_declarationEClass, CLASS_DECLARATION__MODIFIERS);
    createEAttribute(class_declarationEClass, CLASS_DECLARATION__CLASS_NAME);
    createEAttribute(class_declarationEClass, CLASS_DECLARATION__CLASS_HERDADA);
    createEAttribute(class_declarationEClass, CLASS_DECLARATION__INTERFACE_IMPLEMENTADA);
    createEAttribute(class_declarationEClass, CLASS_DECLARATION__INTERFACES_IMPLEMENTADAS);
    createEReference(class_declarationEClass, CLASS_DECLARATION__FIELDS_DECLARATION);

    field_declarationEClass = createEClass(FIELD_DECLARATION);
    createEAttribute(field_declarationEClass, FIELD_DECLARATION__COMMENT);
    createEReference(field_declarationEClass, FIELD_DECLARATION__VARIABLE_DECLARATION);
    createEReference(field_declarationEClass, FIELD_DECLARATION__CONTRUCTOR_NAME);
    createEReference(field_declarationEClass, FIELD_DECLARATION__METHOD_NAME);
    createEReference(field_declarationEClass, FIELD_DECLARATION__STATICINITIALIZER);

    method_declarationEClass = createEClass(METHOD_DECLARATION);
    createEAttribute(method_declarationEClass, METHOD_DECLARATION__MODIFIERS_METHOD);
    createEReference(method_declarationEClass, METHOD_DECLARATION__TYPE_METHOD);
    createEAttribute(method_declarationEClass, METHOD_DECLARATION__NAME_METHOD);
    createEAttribute(method_declarationEClass, METHOD_DECLARATION__LPAREN);
    createEReference(method_declarationEClass, METHOD_DECLARATION__PARAMETER_LIST_METHOD);
    createEAttribute(method_declarationEClass, METHOD_DECLARATION__RPARENT);
    createEReference(method_declarationEClass, METHOD_DECLARATION__STATEMENT_METHOD);
    createEAttribute(method_declarationEClass, METHOD_DECLARATION__DEBUG);

    constructor_declarationEClass = createEClass(CONSTRUCTOR_DECLARATION);
    createEAttribute(constructor_declarationEClass, CONSTRUCTOR_DECLARATION__MODIFIERS_CONSTRUCTOR);
    createEAttribute(constructor_declarationEClass, CONSTRUCTOR_DECLARATION__NAME_CONSTRUCTOR);
    createEAttribute(constructor_declarationEClass, CONSTRUCTOR_DECLARATION__LPAREN);
    createEReference(constructor_declarationEClass, CONSTRUCTOR_DECLARATION__PARAMETER_LIST_CONSTRUCTOR);
    createEAttribute(constructor_declarationEClass, CONSTRUCTOR_DECLARATION__RPARENT);
    createEReference(constructor_declarationEClass, CONSTRUCTOR_DECLARATION__STATEMENT_CONSTRUCTOR);

    parameter_listEClass = createEClass(PARAMETER_LIST);
    createEReference(parameter_listEClass, PARAMETER_LIST__PARAMETER);
    createEReference(parameter_listEClass, PARAMETER_LIST__PARAMETERS);

    parameterEClass = createEClass(PARAMETER);
    createEReference(parameterEClass, PARAMETER__TYPE);
    createEAttribute(parameterEClass, PARAMETER__PARAMETER_NAME);

    variable_declarationEClass = createEClass(VARIABLE_DECLARATION);
    createEAttribute(variable_declarationEClass, VARIABLE_DECLARATION__MODIFIERS_VARIABLE);
    createEReference(variable_declarationEClass, VARIABLE_DECLARATION__TYPE);
    createEReference(variable_declarationEClass, VARIABLE_DECLARATION__NAME_VARIABLE);
    createEReference(variable_declarationEClass, VARIABLE_DECLARATION__NAMES);

    variable_declaratorEClass = createEClass(VARIABLE_DECLARATOR);
    createEAttribute(variable_declaratorEClass, VARIABLE_DECLARATOR__NAME_VARIABLE);
    createEAttribute(variable_declaratorEClass, VARIABLE_DECLARATOR__LEN_VECTOR);
    createEReference(variable_declaratorEClass, VARIABLE_DECLARATOR__VARI);

    variable_initializerEClass = createEClass(VARIABLE_INITIALIZER);
    createEReference(variable_initializerEClass, VARIABLE_INITIALIZER__ARRAY_INIT);
    createEReference(variable_initializerEClass, VARIABLE_INITIALIZER__EXPRESSION);

    array_initializerEClass = createEClass(ARRAY_INITIALIZER);
    createEReference(array_initializerEClass, ARRAY_INITIALIZER__VARIABLEINITIALIZER);

    typeEClass = createEClass(TYPE);
    createEReference(typeEClass, TYPE__TYPE_SPECIFIER);
    createEAttribute(typeEClass, TYPE__TYPE_VECTOR);

    type_specifierEClass = createEClass(TYPE_SPECIFIER);
    createEAttribute(type_specifierEClass, TYPE_SPECIFIER__PRIMITIVE_TYPE);
    createEAttribute(type_specifierEClass, TYPE_SPECIFIER__CLASS_NAME);

    static_initializerEClass = createEClass(STATIC_INITIALIZER);
    createEAttribute(static_initializerEClass, STATIC_INITIALIZER__STATIC);
    createEReference(static_initializerEClass, STATIC_INITIALIZER__NAME);

    statement_blockEClass = createEClass(STATEMENT_BLOCK);
    createEAttribute(statement_blockEClass, STATEMENT_BLOCK__RCURLY);
    createEReference(statement_blockEClass, STATEMENT_BLOCK__STATMENTS);
    createEAttribute(statement_blockEClass, STATEMENT_BLOCK__LCURLY);

    statementEClass = createEClass(STATEMENT);
    createEReference(statementEClass, STATEMENT__VARIABLE_DECLARATION);
    createEReference(statementEClass, STATEMENT__EXPRESSION_STATEMENT);
    createEAttribute(statementEClass, STATEMENT__G);
    createEReference(statementEClass, STATEMENT__IF_STATEMENT);
    createEReference(statementEClass, STATEMENT__DO_STATEMENT);
    createEReference(statementEClass, STATEMENT__WHILE_STATEMENT);
    createEReference(statementEClass, STATEMENT__FOR_STATEMENT);
    createEReference(statementEClass, STATEMENT__SWITCH_STATEMENT);
    createEReference(statementEClass, STATEMENT__EXPRESSION);
    createEAttribute(statementEClass, STATEMENT__RPARENT);
    createEReference(statementEClass, STATEMENT__SYNC_STATEMENT);
    createEAttribute(statementEClass, STATEMENT__RET);
    createEReference(statementEClass, STATEMENT__STATEMENT_BLOCK);
    createEReference(statementEClass, STATEMENT__TRY_STATEMENT);
    createEAttribute(statementEClass, STATEMENT__NAME_STATEMENT);
    createEReference(statementEClass, STATEMENT__STATEMENT);
    createEAttribute(statementEClass, STATEMENT__NAME);

    for_StatementEClass = createEClass(FOR_STATEMENT);
    createEReference(for_StatementEClass, FOR_STATEMENT__VARIABLE);
    createEReference(for_StatementEClass, FOR_STATEMENT__EXPRESSION);
    createEReference(for_StatementEClass, FOR_STATEMENT__EXPRESSION2);
    createEReference(for_StatementEClass, FOR_STATEMENT__EXPRESSION3);
    createEReference(for_StatementEClass, FOR_STATEMENT__STATEMENT);

    expressionEClass = createEClass(EXPRESSION);
    createEReference(expressionEClass, EXPRESSION__NUMERIC_EXPRESSION3);
    createEReference(expressionEClass, EXPRESSION__AUX);
    createEReference(expressionEClass, EXPRESSION__LOGICAL_EXPRESSION);
    createEReference(expressionEClass, EXPRESSION__BIT_EXPRESSION);
    createEReference(expressionEClass, EXPRESSION__CAST_EXPRESSION);
    createEReference(expressionEClass, EXPRESSION__CREATING_EXPRESSION);
    createEReference(expressionEClass, EXPRESSION__LITERAL_EXPRESSION);
    createEAttribute(expressionEClass, EXPRESSION__NULL);
    createEAttribute(expressionEClass, EXPRESSION__SUPER);
    createEAttribute(expressionEClass, EXPRESSION__THIS);
    createEAttribute(expressionEClass, EXPRESSION__NAME);

    expression_auxEClass = createEClass(EXPRESSION_AUX);
    createEReference(expression_auxEClass, EXPRESSION_AUX__ARG_LIST);
    createEReference(expression_auxEClass, EXPRESSION_AUX__AUX);
    createEReference(expression_auxEClass, EXPRESSION_AUX__EXPRESSION2);
    createEReference(expression_auxEClass, EXPRESSION_AUX__EXPRESSION_COMMA);
    createEAttribute(expression_auxEClass, EXPRESSION_AUX__NAME);
    createEAttribute(expression_auxEClass, EXPRESSION_AUX__SGIN);
    createEAttribute(expression_auxEClass, EXPRESSION_AUX__NUMERIC_SIGN);
    createEReference(expression_auxEClass, EXPRESSION_AUX__EXP2);
    createEAttribute(expression_auxEClass, EXPRESSION_AUX__TESTING_SIGN);
    createEReference(expression_auxEClass, EXPRESSION_AUX__EXP1);
    createEAttribute(expression_auxEClass, EXPRESSION_AUX__LOGICAL_SIGN);
    createEReference(expression_auxEClass, EXPRESSION_AUX__AMPERSAND);
    createEAttribute(expression_auxEClass, EXPRESSION_AUX__STRING_SIGN);
    createEAttribute(expression_auxEClass, EXPRESSION_AUX__BIT_SIGN);
    createEReference(expression_auxEClass, EXPRESSION_AUX__EXPRESSION_BIT);
    createEAttribute(expression_auxEClass, EXPRESSION_AUX__LOGIC_OP);
    createEReference(expression_auxEClass, EXPRESSION_AUX__LOGIC_EXP);

    ampersand_RuleEClass = createEClass(AMPERSAND_RULE);
    createEAttribute(ampersand_RuleEClass, AMPERSAND_RULE__A1);
    createEAttribute(ampersand_RuleEClass, AMPERSAND_RULE__A2);

    float_LiteralEClass = createEClass(FLOAT_LITERAL);
    createEAttribute(float_LiteralEClass, FLOAT_LITERAL__DECIMAL_DIGITS1);
    createEAttribute(float_LiteralEClass, FLOAT_LITERAL__DECIMAL_DIGITS2);
    createEAttribute(float_LiteralEClass, FLOAT_LITERAL__EXP);
    createEAttribute(float_LiteralEClass, FLOAT_LITERAL__FLOAT_TYPE_SUFIX);

    literal_ExpressionEClass = createEClass(LITERAL_EXPRESSION);
    createEAttribute(literal_ExpressionEClass, LITERAL_EXPRESSION__EXP);
    createEAttribute(literal_ExpressionEClass, LITERAL_EXPRESSION__EXP1);
    createEReference(literal_ExpressionEClass, LITERAL_EXPRESSION__EXP2);
    createEAttribute(literal_ExpressionEClass, LITERAL_EXPRESSION__STRING);
    createEAttribute(literal_ExpressionEClass, LITERAL_EXPRESSION__CHAR_LIT);

    creating_ExpressionEClass = createEClass(CREATING_EXPRESSION);
    createEAttribute(creating_ExpressionEClass, CREATING_EXPRESSION__CLASS_NAME);
    createEReference(creating_ExpressionEClass, CREATING_EXPRESSION__ARG_LIST);
    createEReference(creating_ExpressionEClass, CREATING_EXPRESSION__TYPE_SPECIFIER);
    createEReference(creating_ExpressionEClass, CREATING_EXPRESSION__EXPRESSION);

    cast_ExpressionEClass = createEClass(CAST_EXPRESSION);
    createEReference(cast_ExpressionEClass, CAST_EXPRESSION__TYPE);
    createEReference(cast_ExpressionEClass, CAST_EXPRESSION__EXPRESSION);

    bit_Expression_NREClass = createEClass(BIT_EXPRESSION_NR);
    createEReference(bit_Expression_NREClass, BIT_EXPRESSION_NR__EXPRESSION);

    logical_Expression_NREClass = createEClass(LOGICAL_EXPRESSION_NR);
    createEAttribute(logical_Expression_NREClass, LOGICAL_EXPRESSION_NR__EXCLAMATION);
    createEReference(logical_Expression_NREClass, LOGICAL_EXPRESSION_NR__EXPRESSION);
    createEAttribute(logical_Expression_NREClass, LOGICAL_EXPRESSION_NR__TRUE);
    createEAttribute(logical_Expression_NREClass, LOGICAL_EXPRESSION_NR__FALSE);

    arg_ListEClass = createEClass(ARG_LIST);
    createEReference(arg_ListEClass, ARG_LIST__EXPRESSION);
    createEReference(arg_ListEClass, ARG_LIST__EXPRESSIONS);

    numeric_Expression_NREClass = createEClass(NUMERIC_EXPRESSION_NR);
    createEAttribute(numeric_Expression_NREClass, NUMERIC_EXPRESSION_NR__SINAL_NUMERIC);
    createEReference(numeric_Expression_NREClass, NUMERIC_EXPRESSION_NR__EXPRESSION);

    switch_statementEClass = createEClass(SWITCH_STATEMENT);
    createEAttribute(switch_statementEClass, SWITCH_STATEMENT__LPAREN);
    createEReference(switch_statementEClass, SWITCH_STATEMENT__EXPRESSION);
    createEAttribute(switch_statementEClass, SWITCH_STATEMENT__RPARENT);
    createEReference(switch_statementEClass, SWITCH_STATEMENT__EXPRESSION2);
    createEReference(switch_statementEClass, SWITCH_STATEMENT__SWITCH_STATEMENTS);

    while_StatementEClass = createEClass(WHILE_STATEMENT);
    createEReference(while_StatementEClass, WHILE_STATEMENT__EXPRESSION);
    createEAttribute(while_StatementEClass, WHILE_STATEMENT__RPARENT);
    createEReference(while_StatementEClass, WHILE_STATEMENT__WHILE_STATEMENT);

    do_StatementEClass = createEClass(DO_STATEMENT);
    createEReference(do_StatementEClass, DO_STATEMENT__DO_STATEMENT);
    createEAttribute(do_StatementEClass, DO_STATEMENT__LPARENT);
    createEAttribute(do_StatementEClass, DO_STATEMENT__RPARENT);

    if_statementEClass = createEClass(IF_STATEMENT);
    createEAttribute(if_statementEClass, IF_STATEMENT__LPAREN);
    createEReference(if_statementEClass, IF_STATEMENT__EXPRESSION);
    createEAttribute(if_statementEClass, IF_STATEMENT__RPARENT);
    createEReference(if_statementEClass, IF_STATEMENT__ID_STATEMENT);
    createEReference(if_statementEClass, IF_STATEMENT__ELSE_STATEMENT);

    try_statementEClass = createEClass(TRY_STATEMENT);
    createEReference(try_statementEClass, TRY_STATEMENT__TRY_STATEMENT);
    createEAttribute(try_statementEClass, TRY_STATEMENT__LPAREN);
    createEReference(try_statementEClass, TRY_STATEMENT__PARAMETERS);
    createEAttribute(try_statementEClass, TRY_STATEMENT__RPARENT);
    createEReference(try_statementEClass, TRY_STATEMENT__CATCH_STATEMENT);
    createEReference(try_statementEClass, TRY_STATEMENT__FINALLY_STATEMENT);

    import_statementEClass = createEClass(IMPORT_STATEMENT);
    createEAttribute(import_statementEClass, IMPORT_STATEMENT__CLASS_NAME);
    createEAttribute(import_statementEClass, IMPORT_STATEMENT__PAC_NAME);

    package_statementEClass = createEClass(PACKAGE_STATEMENT);
    createEAttribute(package_statementEClass, PACKAGE_STATEMENT__PAC_NAME);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Greetings(), this.getCompilation_unit(), null, "greetings", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compilation_unitEClass, Compilation_unit.class, "Compilation_unit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCompilation_unit_Name(), this.getPackage_statement(), null, "name", null, 0, 1, Compilation_unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompilation_unit_Imports(), this.getImport_statement(), null, "imports", null, 0, -1, Compilation_unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCompilation_unit_TypeDeclarations(), this.getType_declaration(), null, "typeDeclarations", null, 0, -1, Compilation_unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(type_declarationEClass, Type_declaration.class, "Type_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getType_declaration_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Type_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_declaration_ClassDec(), this.getClass_declaration(), null, "classDec", null, 0, 1, Type_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getType_declaration_InterfaceDec(), this.getInterface_declaration(), null, "interfaceDec", null, 0, 1, Type_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(interface_declarationEClass, Interface_declaration.class, "Interface_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getInterface_declaration_Modifiers(), ecorePackage.getEString(), "modifiers", null, 0, -1, Interface_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInterface_declaration_InterfaceName(), ecorePackage.getEString(), "interfaceName", null, 0, 1, Interface_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInterface_declaration_InterfaceHerdada(), ecorePackage.getEString(), "interfaceHerdada", null, 0, 1, Interface_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInterface_declaration_InterfacesHerdadas(), ecorePackage.getEString(), "interfacesHerdadas", null, 0, -1, Interface_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInterface_declaration_FieldsDeclaration(), this.getField_declaration(), null, "fieldsDeclaration", null, 0, -1, Interface_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(class_declarationEClass, Class_declaration.class, "Class_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClass_declaration_Modifiers(), ecorePackage.getEString(), "modifiers", null, 0, -1, Class_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClass_declaration_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, Class_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClass_declaration_ClassHerdada(), ecorePackage.getEString(), "classHerdada", null, 0, 1, Class_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClass_declaration_InterfaceImplementada(), ecorePackage.getEString(), "interfaceImplementada", null, 0, 1, Class_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClass_declaration_InterfacesImplementadas(), ecorePackage.getEString(), "interfacesImplementadas", null, 0, -1, Class_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getClass_declaration_FieldsDeclaration(), this.getField_declaration(), null, "fieldsDeclaration", null, 0, -1, Class_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(field_declarationEClass, Field_declaration.class, "Field_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getField_declaration_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Field_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getField_declaration_VariableDeclaration(), this.getVariable_declaration(), null, "variableDeclaration", null, 0, 1, Field_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getField_declaration_ContructorName(), this.getConstructor_declaration(), null, "contructorName", null, 0, 1, Field_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getField_declaration_MethodName(), this.getMethod_declaration(), null, "methodName", null, 0, 1, Field_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getField_declaration_Staticinitializer(), this.getStatic_initializer(), null, "staticinitializer", null, 0, 1, Field_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(method_declarationEClass, Method_declaration.class, "Method_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMethod_declaration_ModifiersMethod(), ecorePackage.getEString(), "modifiersMethod", null, 0, -1, Method_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethod_declaration_TypeMethod(), this.getType(), null, "typeMethod", null, 0, 1, Method_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethod_declaration_NameMethod(), ecorePackage.getEString(), "nameMethod", null, 0, 1, Method_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethod_declaration_LParen(), ecorePackage.getEString(), "lParen", null, 0, 1, Method_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethod_declaration_ParameterListMethod(), this.getParameter_list(), null, "parameterListMethod", null, 0, 1, Method_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethod_declaration_Rparent(), ecorePackage.getEString(), "rparent", null, 0, 1, Method_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethod_declaration_StatementMethod(), this.getStatement_block(), null, "statementMethod", null, 0, 1, Method_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMethod_declaration_Debug(), ecorePackage.getEString(), "debug", null, 0, 1, Method_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constructor_declarationEClass, Constructor_declaration.class, "Constructor_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstructor_declaration_ModifiersConstructor(), ecorePackage.getEString(), "modifiersConstructor", null, 0, -1, Constructor_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstructor_declaration_NameConstructor(), ecorePackage.getEString(), "nameConstructor", null, 0, 1, Constructor_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstructor_declaration_LParen(), ecorePackage.getEString(), "lParen", null, 0, 1, Constructor_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstructor_declaration_ParameterListConstructor(), this.getParameter_list(), null, "parameterListConstructor", null, 0, 1, Constructor_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstructor_declaration_Rparent(), ecorePackage.getEString(), "rparent", null, 0, 1, Constructor_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstructor_declaration_StatementConstructor(), this.getStatement_block(), null, "statementConstructor", null, 0, 1, Constructor_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameter_listEClass, Parameter_list.class, "Parameter_list", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameter_list_Parameter(), this.getParameter(), null, "parameter", null, 0, 1, Parameter_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParameter_list_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Parameter_list.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameter_Type(), this.getType(), null, "type", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getParameter_ParameterName(), ecorePackage.getEString(), "parameterName", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variable_declarationEClass, Variable_declaration.class, "Variable_declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariable_declaration_ModifiersVariable(), ecorePackage.getEString(), "modifiersVariable", null, 0, -1, Variable_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariable_declaration_Type(), this.getType(), null, "type", null, 0, 1, Variable_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariable_declaration_NameVariable(), this.getVariable_declarator(), null, "nameVariable", null, 0, 1, Variable_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariable_declaration_Names(), this.getVariable_declarator(), null, "names", null, 0, -1, Variable_declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variable_declaratorEClass, Variable_declarator.class, "Variable_declarator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVariable_declarator_NameVariable(), ecorePackage.getEString(), "nameVariable", null, 0, 1, Variable_declarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVariable_declarator_LenVector(), ecorePackage.getEString(), "lenVector", null, 0, -1, Variable_declarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariable_declarator_Vari(), this.getVariable_initializer(), null, "vari", null, 0, 1, Variable_declarator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(variable_initializerEClass, Variable_initializer.class, "Variable_initializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVariable_initializer_Array_init(), this.getArray_initializer(), null, "array_init", null, 0, 1, Variable_initializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVariable_initializer_Expression(), this.getExpression(), null, "expression", null, 0, 1, Variable_initializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(array_initializerEClass, Array_initializer.class, "Array_initializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArray_initializer_Variableinitializer(), this.getVariable_initializer(), null, "variableinitializer", null, 0, -1, Array_initializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getType_TypeSpecifier(), this.getType_specifier(), null, "typeSpecifier", null, 0, 1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getType_TypeVector(), ecorePackage.getEString(), "typeVector", null, 0, -1, Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(type_specifierEClass, Type_specifier.class, "Type_specifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getType_specifier_PrimitiveType(), ecorePackage.getEString(), "primitiveType", null, 0, 1, Type_specifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getType_specifier_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, Type_specifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(static_initializerEClass, Static_initializer.class, "Static_initializer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStatic_initializer_Static(), ecorePackage.getEString(), "static", null, 0, 1, Static_initializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatic_initializer_Name(), this.getStatement_block(), null, "name", null, 0, 1, Static_initializer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statement_blockEClass, Statement_block.class, "Statement_block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStatement_block_RCurly(), ecorePackage.getEString(), "rCurly", null, 0, 1, Statement_block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_block_Statments(), this.getStatement(), null, "statments", null, 0, -1, Statement_block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStatement_block_LCurly(), ecorePackage.getEString(), "lCurly", null, 0, 1, Statement_block.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStatement_VariableDeclaration(), this.getVariable_declaration(), null, "variableDeclaration", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_ExpressionStatement(), this.getExpression(), null, "expressionStatement", null, 0, -1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStatement_G(), ecorePackage.getEString(), "g", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_IfStatement(), this.getIf_statement(), null, "ifStatement", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_DoStatement(), this.getDo_Statement(), null, "doStatement", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_WhileStatement(), this.getWhile_Statement(), null, "whileStatement", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_ForStatement(), this.getFor_Statement(), null, "forStatement", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_SwitchStatement(), this.getSwitch_statement(), null, "switchStatement", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_Expression(), this.getExpression(), null, "expression", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStatement_Rparent(), ecorePackage.getEString(), "rparent", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_SyncStatement(), this.getStatement(), null, "syncStatement", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStatement_Ret(), ecorePackage.getEString(), "ret", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_StatementBlock(), this.getStatement_block(), null, "statementBlock", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_TryStatement(), this.getTry_statement(), null, "tryStatement", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStatement_NameStatement(), ecorePackage.getEString(), "nameStatement", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStatement_Statement(), this.getStatement(), null, "statement", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStatement_Name(), ecorePackage.getEString(), "name", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(for_StatementEClass, For_Statement.class, "For_Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFor_Statement_Variable(), this.getVariable_declaration(), null, "variable", null, 0, 1, For_Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFor_Statement_Expression(), this.getExpression(), null, "expression", null, 0, 1, For_Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFor_Statement_Expression2(), this.getExpression(), null, "expression2", null, 0, 1, For_Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFor_Statement_Expression3(), this.getExpression(), null, "expression3", null, 0, 1, For_Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFor_Statement_Statement(), this.getStatement(), null, "statement", null, 0, 1, For_Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpression_NumericExpression3(), this.getNumeric_Expression_NR(), null, "numericExpression3", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_Aux(), this.getExpression_aux(), null, "aux", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_LogicalExpression(), this.getLogical_Expression_NR(), null, "logicalExpression", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_BitExpression(), this.getBit_Expression_NR(), null, "bitExpression", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_CastExpression(), this.getCast_Expression(), null, "castExpression", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_CreatingExpression(), this.getCreating_Expression(), null, "creatingExpression", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_LiteralExpression(), this.getLiteral_Expression(), null, "literalExpression", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpression_Null(), ecorePackage.getEString(), "null", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpression_Super(), ecorePackage.getEString(), "super", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpression_This(), ecorePackage.getEString(), "this", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpression_Name(), ecorePackage.getEString(), "name", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expression_auxEClass, Expression_aux.class, "Expression_aux", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExpression_aux_ArgList(), this.getArg_List(), null, "argList", null, 0, 1, Expression_aux.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_aux_Aux(), this.getExpression_aux(), null, "aux", null, 0, 1, Expression_aux.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_aux_Expression2(), this.getExpression(), null, "expression2", null, 0, 1, Expression_aux.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_aux_ExpressionComma(), this.getExpression(), null, "expressionComma", null, 0, 1, Expression_aux.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpression_aux_Name(), ecorePackage.getEString(), "name", null, 0, 1, Expression_aux.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpression_aux_Sgin(), ecorePackage.getEString(), "sgin", null, 0, 1, Expression_aux.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpression_aux_NumericSign(), ecorePackage.getEString(), "numericSign", null, 0, 1, Expression_aux.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_aux_Exp2(), this.getExpression(), null, "exp2", null, 0, 1, Expression_aux.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpression_aux_TestingSign(), ecorePackage.getEString(), "testingSign", null, 0, 1, Expression_aux.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_aux_Exp1(), this.getExpression(), null, "exp1", null, 0, 1, Expression_aux.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpression_aux_LogicalSign(), ecorePackage.getEString(), "logicalSign", null, 0, 1, Expression_aux.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_aux_Ampersand(), this.getAmpersand_Rule(), null, "ampersand", null, 0, 1, Expression_aux.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpression_aux_StringSign(), ecorePackage.getEString(), "stringSign", null, 0, 1, Expression_aux.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpression_aux_BitSign(), ecorePackage.getEString(), "bitSign", null, 0, 1, Expression_aux.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_aux_ExpressionBit(), this.getExpression(), null, "expressionBit", null, 0, 1, Expression_aux.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExpression_aux_LogicOp(), ecorePackage.getEString(), "logicOp", null, 0, 1, Expression_aux.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExpression_aux_LogicExp(), this.getExpression(), null, "logicExp", null, 0, 1, Expression_aux.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ampersand_RuleEClass, Ampersand_Rule.class, "Ampersand_Rule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAmpersand_Rule_A1(), ecorePackage.getEString(), "a1", null, 0, 1, Ampersand_Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAmpersand_Rule_A2(), ecorePackage.getEString(), "a2", null, 0, 1, Ampersand_Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(float_LiteralEClass, Float_Literal.class, "Float_Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFloat_Literal_DecimalDigits1(), ecorePackage.getEInt(), "decimalDigits1", null, 0, 1, Float_Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFloat_Literal_DecimalDigits2(), ecorePackage.getEInt(), "decimalDigits2", null, 0, 1, Float_Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFloat_Literal_Exp(), ecorePackage.getEString(), "exp", null, 0, 1, Float_Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFloat_Literal_FloatTypeSufix(), ecorePackage.getEString(), "floatTypeSufix", null, 0, 1, Float_Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literal_ExpressionEClass, Literal_Expression.class, "Literal_Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLiteral_Expression_Exp(), ecorePackage.getEString(), "exp", null, 0, 1, Literal_Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLiteral_Expression_Exp1(), ecorePackage.getEInt(), "exp1", null, 0, 1, Literal_Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLiteral_Expression_Exp2(), this.getFloat_Literal(), null, "exp2", null, 0, 1, Literal_Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLiteral_Expression_String(), ecorePackage.getEString(), "string", null, 0, 1, Literal_Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLiteral_Expression_CharLit(), ecorePackage.getEString(), "charLit", null, 0, 1, Literal_Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(creating_ExpressionEClass, Creating_Expression.class, "Creating_Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCreating_Expression_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, Creating_Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCreating_Expression_ArgList(), this.getArg_List(), null, "argList", null, 0, 1, Creating_Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCreating_Expression_TypeSpecifier(), this.getType_specifier(), null, "typeSpecifier", null, 0, 1, Creating_Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCreating_Expression_Expression(), this.getExpression(), null, "expression", null, 0, 1, Creating_Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cast_ExpressionEClass, Cast_Expression.class, "Cast_Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCast_Expression_Type(), this.getType(), null, "type", null, 0, 1, Cast_Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCast_Expression_Expression(), this.getExpression(), null, "expression", null, 0, 1, Cast_Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(bit_Expression_NREClass, Bit_Expression_NR.class, "Bit_Expression_NR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBit_Expression_NR_Expression(), this.getExpression(), null, "expression", null, 0, 1, Bit_Expression_NR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(logical_Expression_NREClass, Logical_Expression_NR.class, "Logical_Expression_NR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLogical_Expression_NR_Exclamation(), ecorePackage.getEString(), "exclamation", null, 0, 1, Logical_Expression_NR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLogical_Expression_NR_Expression(), this.getExpression(), null, "expression", null, 0, 1, Logical_Expression_NR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLogical_Expression_NR_True(), ecorePackage.getEString(), "true", null, 0, 1, Logical_Expression_NR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLogical_Expression_NR_False(), ecorePackage.getEString(), "false", null, 0, 1, Logical_Expression_NR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(arg_ListEClass, Arg_List.class, "Arg_List", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getArg_List_Expression(), this.getExpression(), null, "expression", null, 0, 1, Arg_List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getArg_List_Expressions(), this.getExpression(), null, "expressions", null, 0, -1, Arg_List.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(numeric_Expression_NREClass, Numeric_Expression_NR.class, "Numeric_Expression_NR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNumeric_Expression_NR_Sinal_numeric(), ecorePackage.getEString(), "sinal_numeric", null, 0, 1, Numeric_Expression_NR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNumeric_Expression_NR_Expression(), this.getExpression(), null, "expression", null, 0, 1, Numeric_Expression_NR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(switch_statementEClass, Switch_statement.class, "Switch_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSwitch_statement_LParen(), ecorePackage.getEString(), "lParen", null, 0, 1, Switch_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSwitch_statement_Expression(), this.getExpression(), null, "expression", null, 0, 1, Switch_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSwitch_statement_Rparent(), ecorePackage.getEString(), "rparent", null, 0, 1, Switch_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSwitch_statement_Expression2(), this.getExpression(), null, "expression2", null, 0, -1, Switch_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSwitch_statement_SwitchStatements(), this.getStatement(), null, "switchStatements", null, 0, -1, Switch_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(while_StatementEClass, While_Statement.class, "While_Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getWhile_Statement_Expression(), this.getExpression(), null, "expression", null, 0, 1, While_Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWhile_Statement_Rparent(), ecorePackage.getEString(), "rparent", null, 0, 1, While_Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getWhile_Statement_WhileStatement(), this.getStatement(), null, "whileStatement", null, 0, 1, While_Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(do_StatementEClass, Do_Statement.class, "Do_Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDo_Statement_DoStatement(), this.getStatement(), null, "doStatement", null, 0, 1, Do_Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDo_Statement_Lparent(), ecorePackage.getEString(), "lparent", null, 0, 1, Do_Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDo_Statement_Rparent(), ecorePackage.getEString(), "rparent", null, 0, 1, Do_Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(if_statementEClass, If_statement.class, "If_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIf_statement_Lparen(), ecorePackage.getEString(), "lparen", null, 0, 1, If_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIf_statement_Expression(), this.getExpression(), null, "expression", null, 0, 1, If_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIf_statement_Rparent(), ecorePackage.getEString(), "rparent", null, 0, 1, If_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIf_statement_IdStatement(), this.getStatement(), null, "idStatement", null, 0, 1, If_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIf_statement_ElseStatement(), this.getStatement(), null, "elseStatement", null, 0, 1, If_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(try_statementEClass, Try_statement.class, "Try_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTry_statement_TryStatement(), this.getStatement(), null, "tryStatement", null, 0, 1, Try_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTry_statement_LParen(), ecorePackage.getEString(), "lParen", null, 0, -1, Try_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTry_statement_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Try_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTry_statement_Rparent(), ecorePackage.getEString(), "rparent", null, 0, -1, Try_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTry_statement_CatchStatement(), this.getStatement(), null, "catchStatement", null, 0, -1, Try_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTry_statement_FinallyStatement(), this.getStatement(), null, "finallyStatement", null, 0, 1, Try_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(import_statementEClass, Import_statement.class, "Import_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImport_statement_ClassName(), ecorePackage.getEString(), "className", null, 0, 1, Import_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImport_statement_PacName(), ecorePackage.getEString(), "pacName", null, 0, 1, Import_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(package_statementEClass, Package_statement.class, "Package_statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPackage_statement_PacName(), ecorePackage.getEString(), "pacName", null, 0, 1, Package_statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //MyDslPackageImpl
