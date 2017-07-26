/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ModelImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Greetings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__GREETINGS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Compilation_unitImpl <em>Compilation unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Compilation_unitImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCompilation_unit()
   * @generated
   */
  int COMPILATION_UNIT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT__NAME = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Type Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT__TYPE_DECLARATIONS = 2;

  /**
   * The number of structural features of the '<em>Compilation unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPILATION_UNIT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Type_declarationImpl <em>Type declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Type_declarationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getType_declaration()
   * @generated
   */
  int TYPE_DECLARATION = 2;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION__COMMENT = 0;

  /**
   * The feature id for the '<em><b>Class Dec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION__CLASS_DEC = 1;

  /**
   * The feature id for the '<em><b>Interface Dec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION__INTERFACE_DEC = 2;

  /**
   * The number of structural features of the '<em>Type declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DECLARATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Interface_declarationImpl <em>Interface declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Interface_declarationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getInterface_declaration()
   * @generated
   */
  int INTERFACE_DECLARATION = 3;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECLARATION__MODIFIERS = 0;

  /**
   * The feature id for the '<em><b>Interface Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECLARATION__INTERFACE_NAME = 1;

  /**
   * The feature id for the '<em><b>Interface Herdada</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECLARATION__INTERFACE_HERDADA = 2;

  /**
   * The feature id for the '<em><b>Interfaces Herdadas</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECLARATION__INTERFACES_HERDADAS = 3;

  /**
   * The feature id for the '<em><b>Fields Declaration</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECLARATION__FIELDS_DECLARATION = 4;

  /**
   * The number of structural features of the '<em>Interface declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERFACE_DECLARATION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Class_declarationImpl <em>Class declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Class_declarationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getClass_declaration()
   * @generated
   */
  int CLASS_DECLARATION = 4;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__MODIFIERS = 0;

  /**
   * The feature id for the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__CLASS_NAME = 1;

  /**
   * The feature id for the '<em><b>Class Herdada</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__CLASS_HERDADA = 2;

  /**
   * The feature id for the '<em><b>Interface Implementada</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__INTERFACE_IMPLEMENTADA = 3;

  /**
   * The feature id for the '<em><b>Interfaces Implementadas</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__INTERFACES_IMPLEMENTADAS = 4;

  /**
   * The feature id for the '<em><b>Fields Declaration</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION__FIELDS_DECLARATION = 5;

  /**
   * The number of structural features of the '<em>Class declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_DECLARATION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Field_declarationImpl <em>Field declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Field_declarationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getField_declaration()
   * @generated
   */
  int FIELD_DECLARATION = 5;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECLARATION__COMMENT = 0;

  /**
   * The feature id for the '<em><b>Variable Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECLARATION__VARIABLE_DECLARATION = 1;

  /**
   * The feature id for the '<em><b>Contructor Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECLARATION__CONTRUCTOR_NAME = 2;

  /**
   * The feature id for the '<em><b>Method Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECLARATION__METHOD_NAME = 3;

  /**
   * The feature id for the '<em><b>Staticinitializer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECLARATION__STATICINITIALIZER = 4;

  /**
   * The number of structural features of the '<em>Field declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_DECLARATION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Method_declarationImpl <em>Method declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Method_declarationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMethod_declaration()
   * @generated
   */
  int METHOD_DECLARATION = 6;

  /**
   * The feature id for the '<em><b>Modifiers Method</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__MODIFIERS_METHOD = 0;

  /**
   * The feature id for the '<em><b>Type Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__TYPE_METHOD = 1;

  /**
   * The feature id for the '<em><b>Name Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__NAME_METHOD = 2;

  /**
   * The feature id for the '<em><b>LParen</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__LPAREN = 3;

  /**
   * The feature id for the '<em><b>Parameter List Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__PARAMETER_LIST_METHOD = 4;

  /**
   * The feature id for the '<em><b>Rparent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__RPARENT = 5;

  /**
   * The feature id for the '<em><b>Statement Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__STATEMENT_METHOD = 6;

  /**
   * The feature id for the '<em><b>Debug</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION__DEBUG = 7;

  /**
   * The number of structural features of the '<em>Method declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_DECLARATION_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Constructor_declarationImpl <em>Constructor declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Constructor_declarationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getConstructor_declaration()
   * @generated
   */
  int CONSTRUCTOR_DECLARATION = 7;

  /**
   * The feature id for the '<em><b>Modifiers Constructor</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_DECLARATION__MODIFIERS_CONSTRUCTOR = 0;

  /**
   * The feature id for the '<em><b>Name Constructor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_DECLARATION__NAME_CONSTRUCTOR = 1;

  /**
   * The feature id for the '<em><b>LParen</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_DECLARATION__LPAREN = 2;

  /**
   * The feature id for the '<em><b>Parameter List Constructor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_DECLARATION__PARAMETER_LIST_CONSTRUCTOR = 3;

  /**
   * The feature id for the '<em><b>Rparent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_DECLARATION__RPARENT = 4;

  /**
   * The feature id for the '<em><b>Statement Constructor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_DECLARATION__STATEMENT_CONSTRUCTOR = 5;

  /**
   * The number of structural features of the '<em>Constructor declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_DECLARATION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Parameter_listImpl <em>Parameter list</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Parameter_listImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getParameter_list()
   * @generated
   */
  int PARAMETER_LIST = 8;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_LIST__PARAMETER = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_LIST__PARAMETERS = 1;

  /**
   * The number of structural features of the '<em>Parameter list</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_LIST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ParameterImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 9;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE = 0;

  /**
   * The feature id for the '<em><b>Parameter Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__PARAMETER_NAME = 1;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Variable_declarationImpl <em>Variable declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Variable_declarationImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVariable_declaration()
   * @generated
   */
  int VARIABLE_DECLARATION = 10;

  /**
   * The feature id for the '<em><b>Modifiers Variable</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__MODIFIERS_VARIABLE = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__TYPE = 1;

  /**
   * The feature id for the '<em><b>Name Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__NAME_VARIABLE = 2;

  /**
   * The feature id for the '<em><b>Names</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION__NAMES = 3;

  /**
   * The number of structural features of the '<em>Variable declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Variable_declaratorImpl <em>Variable declarator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Variable_declaratorImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVariable_declarator()
   * @generated
   */
  int VARIABLE_DECLARATOR = 11;

  /**
   * The feature id for the '<em><b>Name Variable</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATOR__NAME_VARIABLE = 0;

  /**
   * The feature id for the '<em><b>Len Vector</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATOR__LEN_VECTOR = 1;

  /**
   * The feature id for the '<em><b>Vari</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATOR__VARI = 2;

  /**
   * The number of structural features of the '<em>Variable declarator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECLARATOR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Variable_initializerImpl <em>Variable initializer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Variable_initializerImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVariable_initializer()
   * @generated
   */
  int VARIABLE_INITIALIZER = 12;

  /**
   * The feature id for the '<em><b>Array init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_INITIALIZER__ARRAY_INIT = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_INITIALIZER__EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Variable initializer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_INITIALIZER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Array_initializerImpl <em>Array initializer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Array_initializerImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getArray_initializer()
   * @generated
   */
  int ARRAY_INITIALIZER = 13;

  /**
   * The feature id for the '<em><b>Variableinitializer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INITIALIZER__VARIABLEINITIALIZER = 0;

  /**
   * The number of structural features of the '<em>Array initializer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INITIALIZER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.TypeImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getType()
   * @generated
   */
  int TYPE = 14;

  /**
   * The feature id for the '<em><b>Type Specifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__TYPE_SPECIFIER = 0;

  /**
   * The feature id for the '<em><b>Type Vector</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__TYPE_VECTOR = 1;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Type_specifierImpl <em>Type specifier</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Type_specifierImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getType_specifier()
   * @generated
   */
  int TYPE_SPECIFIER = 15;

  /**
   * The feature id for the '<em><b>Primitive Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SPECIFIER__PRIMITIVE_TYPE = 0;

  /**
   * The feature id for the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SPECIFIER__CLASS_NAME = 1;

  /**
   * The number of structural features of the '<em>Type specifier</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_SPECIFIER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Static_initializerImpl <em>Static initializer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Static_initializerImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getStatic_initializer()
   * @generated
   */
  int STATIC_INITIALIZER = 16;

  /**
   * The feature id for the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_INITIALIZER__STATIC = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_INITIALIZER__NAME = 1;

  /**
   * The number of structural features of the '<em>Static initializer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_INITIALIZER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Statement_blockImpl <em>Statement block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Statement_blockImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getStatement_block()
   * @generated
   */
  int STATEMENT_BLOCK = 17;

  /**
   * The feature id for the '<em><b>RCurly</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BLOCK__RCURLY = 0;

  /**
   * The feature id for the '<em><b>Statments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BLOCK__STATMENTS = 1;

  /**
   * The feature id for the '<em><b>LCurly</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BLOCK__LCURLY = 2;

  /**
   * The number of structural features of the '<em>Statement block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_BLOCK_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.StatementImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 18;

  /**
   * The feature id for the '<em><b>Variable Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__VARIABLE_DECLARATION = 0;

  /**
   * The feature id for the '<em><b>Expression Statement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__EXPRESSION_STATEMENT = 1;

  /**
   * The feature id for the '<em><b>G</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__G = 2;

  /**
   * The feature id for the '<em><b>If Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__IF_STATEMENT = 3;

  /**
   * The feature id for the '<em><b>Do Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__DO_STATEMENT = 4;

  /**
   * The feature id for the '<em><b>While Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__WHILE_STATEMENT = 5;

  /**
   * The feature id for the '<em><b>For Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__FOR_STATEMENT = 6;

  /**
   * The feature id for the '<em><b>Switch Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__SWITCH_STATEMENT = 7;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__EXPRESSION = 8;

  /**
   * The feature id for the '<em><b>Rparent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__RPARENT = 9;

  /**
   * The feature id for the '<em><b>Sync Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__SYNC_STATEMENT = 10;

  /**
   * The feature id for the '<em><b>Ret</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__RET = 11;

  /**
   * The feature id for the '<em><b>Statement Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__STATEMENT_BLOCK = 12;

  /**
   * The feature id for the '<em><b>Try Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__TRY_STATEMENT = 13;

  /**
   * The feature id for the '<em><b>Name Statement</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__NAME_STATEMENT = 14;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__STATEMENT = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__NAME = 16;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 17;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.For_StatementImpl <em>For Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.For_StatementImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFor_Statement()
   * @generated
   */
  int FOR_STATEMENT = 19;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__VARIABLE = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__EXPRESSION = 1;

  /**
   * The feature id for the '<em><b>Expression2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__EXPRESSION2 = 2;

  /**
   * The feature id for the '<em><b>Expression3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__EXPRESSION3 = 3;

  /**
   * The feature id for the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT__STATEMENT = 4;

  /**
   * The number of structural features of the '<em>For Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_STATEMENT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ExpressionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 20;

  /**
   * The feature id for the '<em><b>Numeric Expression3</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__NUMERIC_EXPRESSION3 = 0;

  /**
   * The feature id for the '<em><b>Aux</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__AUX = 1;

  /**
   * The feature id for the '<em><b>Logical Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__LOGICAL_EXPRESSION = 2;

  /**
   * The feature id for the '<em><b>Bit Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__BIT_EXPRESSION = 3;

  /**
   * The feature id for the '<em><b>Cast Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__CAST_EXPRESSION = 4;

  /**
   * The feature id for the '<em><b>Creating Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__CREATING_EXPRESSION = 5;

  /**
   * The feature id for the '<em><b>Literal Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__LITERAL_EXPRESSION = 6;

  /**
   * The feature id for the '<em><b>Null</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__NULL = 7;

  /**
   * The feature id for the '<em><b>Super</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__SUPER = 8;

  /**
   * The feature id for the '<em><b>This</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__THIS = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__NAME = 10;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 11;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Expression_auxImpl <em>Expression aux</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Expression_auxImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExpression_aux()
   * @generated
   */
  int EXPRESSION_AUX = 21;

  /**
   * The feature id for the '<em><b>Arg List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_AUX__ARG_LIST = 0;

  /**
   * The feature id for the '<em><b>Aux</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_AUX__AUX = 1;

  /**
   * The feature id for the '<em><b>Expression2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_AUX__EXPRESSION2 = 2;

  /**
   * The feature id for the '<em><b>Expression Comma</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_AUX__EXPRESSION_COMMA = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_AUX__NAME = 4;

  /**
   * The feature id for the '<em><b>Sgin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_AUX__SGIN = 5;

  /**
   * The feature id for the '<em><b>Numeric Sign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_AUX__NUMERIC_SIGN = 6;

  /**
   * The feature id for the '<em><b>Exp2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_AUX__EXP2 = 7;

  /**
   * The feature id for the '<em><b>Testing Sign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_AUX__TESTING_SIGN = 8;

  /**
   * The feature id for the '<em><b>Exp1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_AUX__EXP1 = 9;

  /**
   * The feature id for the '<em><b>Logical Sign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_AUX__LOGICAL_SIGN = 10;

  /**
   * The feature id for the '<em><b>Ampersand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_AUX__AMPERSAND = 11;

  /**
   * The feature id for the '<em><b>String Sign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_AUX__STRING_SIGN = 12;

  /**
   * The feature id for the '<em><b>Bit Sign</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_AUX__BIT_SIGN = 13;

  /**
   * The feature id for the '<em><b>Expression Bit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_AUX__EXPRESSION_BIT = 14;

  /**
   * The feature id for the '<em><b>Logic Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_AUX__LOGIC_OP = 15;

  /**
   * The feature id for the '<em><b>Logic Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_AUX__LOGIC_EXP = 16;

  /**
   * The number of structural features of the '<em>Expression aux</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_AUX_FEATURE_COUNT = 17;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Ampersand_RuleImpl <em>Ampersand Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Ampersand_RuleImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAmpersand_Rule()
   * @generated
   */
  int AMPERSAND_RULE = 22;

  /**
   * The feature id for the '<em><b>A1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AMPERSAND_RULE__A1 = 0;

  /**
   * The feature id for the '<em><b>A2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AMPERSAND_RULE__A2 = 1;

  /**
   * The number of structural features of the '<em>Ampersand Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AMPERSAND_RULE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Float_LiteralImpl <em>Float Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Float_LiteralImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFloat_Literal()
   * @generated
   */
  int FLOAT_LITERAL = 23;

  /**
   * The feature id for the '<em><b>Decimal Digits1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL__DECIMAL_DIGITS1 = 0;

  /**
   * The feature id for the '<em><b>Decimal Digits2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL__DECIMAL_DIGITS2 = 1;

  /**
   * The feature id for the '<em><b>Exp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL__EXP = 2;

  /**
   * The feature id for the '<em><b>Float Type Sufix</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL__FLOAT_TYPE_SUFIX = 3;

  /**
   * The number of structural features of the '<em>Float Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_LITERAL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Literal_ExpressionImpl <em>Literal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Literal_ExpressionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getLiteral_Expression()
   * @generated
   */
  int LITERAL_EXPRESSION = 24;

  /**
   * The feature id for the '<em><b>Exp</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_EXPRESSION__EXP = 0;

  /**
   * The feature id for the '<em><b>Exp1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_EXPRESSION__EXP1 = 1;

  /**
   * The feature id for the '<em><b>Exp2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_EXPRESSION__EXP2 = 2;

  /**
   * The feature id for the '<em><b>String</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_EXPRESSION__STRING = 3;

  /**
   * The feature id for the '<em><b>Char Lit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_EXPRESSION__CHAR_LIT = 4;

  /**
   * The number of structural features of the '<em>Literal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_EXPRESSION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Creating_ExpressionImpl <em>Creating Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Creating_ExpressionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCreating_Expression()
   * @generated
   */
  int CREATING_EXPRESSION = 25;

  /**
   * The feature id for the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATING_EXPRESSION__CLASS_NAME = 0;

  /**
   * The feature id for the '<em><b>Arg List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATING_EXPRESSION__ARG_LIST = 1;

  /**
   * The feature id for the '<em><b>Type Specifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATING_EXPRESSION__TYPE_SPECIFIER = 2;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATING_EXPRESSION__EXPRESSION = 3;

  /**
   * The number of structural features of the '<em>Creating Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CREATING_EXPRESSION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Cast_ExpressionImpl <em>Cast Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Cast_ExpressionImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCast_Expression()
   * @generated
   */
  int CAST_EXPRESSION = 26;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPRESSION__TYPE = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPRESSION__EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Cast Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Bit_Expression_NRImpl <em>Bit Expression NR</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Bit_Expression_NRImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBit_Expression_NR()
   * @generated
   */
  int BIT_EXPRESSION_NR = 27;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIT_EXPRESSION_NR__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Bit Expression NR</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BIT_EXPRESSION_NR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Logical_Expression_NRImpl <em>Logical Expression NR</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Logical_Expression_NRImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getLogical_Expression_NR()
   * @generated
   */
  int LOGICAL_EXPRESSION_NR = 28;

  /**
   * The feature id for the '<em><b>Exclamation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_EXPRESSION_NR__EXCLAMATION = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_EXPRESSION_NR__EXPRESSION = 1;

  /**
   * The feature id for the '<em><b>True</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_EXPRESSION_NR__TRUE = 2;

  /**
   * The feature id for the '<em><b>False</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_EXPRESSION_NR__FALSE = 3;

  /**
   * The number of structural features of the '<em>Logical Expression NR</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_EXPRESSION_NR_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Arg_ListImpl <em>Arg List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Arg_ListImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getArg_List()
   * @generated
   */
  int ARG_LIST = 29;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG_LIST__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG_LIST__EXPRESSIONS = 1;

  /**
   * The number of structural features of the '<em>Arg List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARG_LIST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Numeric_Expression_NRImpl <em>Numeric Expression NR</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Numeric_Expression_NRImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getNumeric_Expression_NR()
   * @generated
   */
  int NUMERIC_EXPRESSION_NR = 30;

  /**
   * The feature id for the '<em><b>Sinal numeric</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_EXPRESSION_NR__SINAL_NUMERIC = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_EXPRESSION_NR__EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Numeric Expression NR</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NUMERIC_EXPRESSION_NR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Switch_statementImpl <em>Switch statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Switch_statementImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSwitch_statement()
   * @generated
   */
  int SWITCH_STATEMENT = 31;

  /**
   * The feature id for the '<em><b>LParen</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT__LPAREN = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT__EXPRESSION = 1;

  /**
   * The feature id for the '<em><b>Rparent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT__RPARENT = 2;

  /**
   * The feature id for the '<em><b>Expression2</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT__EXPRESSION2 = 3;

  /**
   * The feature id for the '<em><b>Switch Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT__SWITCH_STATEMENTS = 4;

  /**
   * The number of structural features of the '<em>Switch statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_STATEMENT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.While_StatementImpl <em>While Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.While_StatementImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getWhile_Statement()
   * @generated
   */
  int WHILE_STATEMENT = 32;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Rparent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT__RPARENT = 1;

  /**
   * The feature id for the '<em><b>While Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT__WHILE_STATEMENT = 2;

  /**
   * The number of structural features of the '<em>While Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WHILE_STATEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Do_StatementImpl <em>Do Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Do_StatementImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDo_Statement()
   * @generated
   */
  int DO_STATEMENT = 33;

  /**
   * The feature id for the '<em><b>Do Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_STATEMENT__DO_STATEMENT = 0;

  /**
   * The feature id for the '<em><b>Lparent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_STATEMENT__LPARENT = 1;

  /**
   * The feature id for the '<em><b>Rparent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_STATEMENT__RPARENT = 2;

  /**
   * The number of structural features of the '<em>Do Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DO_STATEMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.If_statementImpl <em>If statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.If_statementImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getIf_statement()
   * @generated
   */
  int IF_STATEMENT = 34;

  /**
   * The feature id for the '<em><b>Lparen</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__LPAREN = 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__EXPRESSION = 1;

  /**
   * The feature id for the '<em><b>Rparent</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__RPARENT = 2;

  /**
   * The feature id for the '<em><b>Id Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__ID_STATEMENT = 3;

  /**
   * The feature id for the '<em><b>Else Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT__ELSE_STATEMENT = 4;

  /**
   * The number of structural features of the '<em>If statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_STATEMENT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Try_statementImpl <em>Try statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Try_statementImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTry_statement()
   * @generated
   */
  int TRY_STATEMENT = 35;

  /**
   * The feature id for the '<em><b>Try Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT__TRY_STATEMENT = 0;

  /**
   * The feature id for the '<em><b>LParen</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT__LPAREN = 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT__PARAMETERS = 2;

  /**
   * The feature id for the '<em><b>Rparent</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT__RPARENT = 3;

  /**
   * The feature id for the '<em><b>Catch Statement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT__CATCH_STATEMENT = 4;

  /**
   * The feature id for the '<em><b>Finally Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT__FINALLY_STATEMENT = 5;

  /**
   * The number of structural features of the '<em>Try statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRY_STATEMENT_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Import_statementImpl <em>Import statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Import_statementImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getImport_statement()
   * @generated
   */
  int IMPORT_STATEMENT = 36;

  /**
   * The feature id for the '<em><b>Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_STATEMENT__CLASS_NAME = 0;

  /**
   * The feature id for the '<em><b>Pac Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_STATEMENT__PAC_NAME = 1;

  /**
   * The number of structural features of the '<em>Import statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.Package_statementImpl <em>Package statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.Package_statementImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPackage_statement()
   * @generated
   */
  int PACKAGE_STATEMENT = 37;

  /**
   * The feature id for the '<em><b>Pac Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_STATEMENT__PAC_NAME = 0;

  /**
   * The number of structural features of the '<em>Package statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PACKAGE_STATEMENT_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.example.mydsl.myDsl.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Model#getGreetings <em>Greetings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Greetings</em>'.
   * @see org.xtext.example.mydsl.myDsl.Model#getGreetings()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Greetings();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Compilation_unit <em>Compilation unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compilation unit</em>'.
   * @see org.xtext.example.mydsl.myDsl.Compilation_unit
   * @generated
   */
  EClass getCompilation_unit();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Compilation_unit#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Compilation_unit#getName()
   * @see #getCompilation_unit()
   * @generated
   */
  EReference getCompilation_unit_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Compilation_unit#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.xtext.example.mydsl.myDsl.Compilation_unit#getImports()
   * @see #getCompilation_unit()
   * @generated
   */
  EReference getCompilation_unit_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Compilation_unit#getTypeDeclarations <em>Type Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type Declarations</em>'.
   * @see org.xtext.example.mydsl.myDsl.Compilation_unit#getTypeDeclarations()
   * @see #getCompilation_unit()
   * @generated
   */
  EReference getCompilation_unit_TypeDeclarations();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Type_declaration <em>Type declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.Type_declaration
   * @generated
   */
  EClass getType_declaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Type_declaration#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see org.xtext.example.mydsl.myDsl.Type_declaration#getComment()
   * @see #getType_declaration()
   * @generated
   */
  EAttribute getType_declaration_Comment();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Type_declaration#getClassDec <em>Class Dec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Class Dec</em>'.
   * @see org.xtext.example.mydsl.myDsl.Type_declaration#getClassDec()
   * @see #getType_declaration()
   * @generated
   */
  EReference getType_declaration_ClassDec();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Type_declaration#getInterfaceDec <em>Interface Dec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interface Dec</em>'.
   * @see org.xtext.example.mydsl.myDsl.Type_declaration#getInterfaceDec()
   * @see #getType_declaration()
   * @generated
   */
  EReference getType_declaration_InterfaceDec();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Interface_declaration <em>Interface declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interface declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.Interface_declaration
   * @generated
   */
  EClass getInterface_declaration();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.myDsl.Interface_declaration#getModifiers <em>Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Modifiers</em>'.
   * @see org.xtext.example.mydsl.myDsl.Interface_declaration#getModifiers()
   * @see #getInterface_declaration()
   * @generated
   */
  EAttribute getInterface_declaration_Modifiers();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Interface_declaration#getInterfaceName <em>Interface Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Interface Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Interface_declaration#getInterfaceName()
   * @see #getInterface_declaration()
   * @generated
   */
  EAttribute getInterface_declaration_InterfaceName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Interface_declaration#getInterfaceHerdada <em>Interface Herdada</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Interface Herdada</em>'.
   * @see org.xtext.example.mydsl.myDsl.Interface_declaration#getInterfaceHerdada()
   * @see #getInterface_declaration()
   * @generated
   */
  EAttribute getInterface_declaration_InterfaceHerdada();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.myDsl.Interface_declaration#getInterfacesHerdadas <em>Interfaces Herdadas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Interfaces Herdadas</em>'.
   * @see org.xtext.example.mydsl.myDsl.Interface_declaration#getInterfacesHerdadas()
   * @see #getInterface_declaration()
   * @generated
   */
  EAttribute getInterface_declaration_InterfacesHerdadas();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Interface_declaration#getFieldsDeclaration <em>Fields Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields Declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.Interface_declaration#getFieldsDeclaration()
   * @see #getInterface_declaration()
   * @generated
   */
  EReference getInterface_declaration_FieldsDeclaration();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Class_declaration <em>Class declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.Class_declaration
   * @generated
   */
  EClass getClass_declaration();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.myDsl.Class_declaration#getModifiers <em>Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Modifiers</em>'.
   * @see org.xtext.example.mydsl.myDsl.Class_declaration#getModifiers()
   * @see #getClass_declaration()
   * @generated
   */
  EAttribute getClass_declaration_Modifiers();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Class_declaration#getClassName <em>Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Class_declaration#getClassName()
   * @see #getClass_declaration()
   * @generated
   */
  EAttribute getClass_declaration_ClassName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Class_declaration#getClassHerdada <em>Class Herdada</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Herdada</em>'.
   * @see org.xtext.example.mydsl.myDsl.Class_declaration#getClassHerdada()
   * @see #getClass_declaration()
   * @generated
   */
  EAttribute getClass_declaration_ClassHerdada();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Class_declaration#getInterfaceImplementada <em>Interface Implementada</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Interface Implementada</em>'.
   * @see org.xtext.example.mydsl.myDsl.Class_declaration#getInterfaceImplementada()
   * @see #getClass_declaration()
   * @generated
   */
  EAttribute getClass_declaration_InterfaceImplementada();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.myDsl.Class_declaration#getInterfacesImplementadas <em>Interfaces Implementadas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Interfaces Implementadas</em>'.
   * @see org.xtext.example.mydsl.myDsl.Class_declaration#getInterfacesImplementadas()
   * @see #getClass_declaration()
   * @generated
   */
  EAttribute getClass_declaration_InterfacesImplementadas();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Class_declaration#getFieldsDeclaration <em>Fields Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields Declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.Class_declaration#getFieldsDeclaration()
   * @see #getClass_declaration()
   * @generated
   */
  EReference getClass_declaration_FieldsDeclaration();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Field_declaration <em>Field declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.Field_declaration
   * @generated
   */
  EClass getField_declaration();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Field_declaration#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see org.xtext.example.mydsl.myDsl.Field_declaration#getComment()
   * @see #getField_declaration()
   * @generated
   */
  EAttribute getField_declaration_Comment();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Field_declaration#getVariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable Declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.Field_declaration#getVariableDeclaration()
   * @see #getField_declaration()
   * @generated
   */
  EReference getField_declaration_VariableDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Field_declaration#getContructorName <em>Contructor Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Contructor Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Field_declaration#getContructorName()
   * @see #getField_declaration()
   * @generated
   */
  EReference getField_declaration_ContructorName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Field_declaration#getMethodName <em>Method Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Method Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Field_declaration#getMethodName()
   * @see #getField_declaration()
   * @generated
   */
  EReference getField_declaration_MethodName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Field_declaration#getStaticinitializer <em>Staticinitializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Staticinitializer</em>'.
   * @see org.xtext.example.mydsl.myDsl.Field_declaration#getStaticinitializer()
   * @see #getField_declaration()
   * @generated
   */
  EReference getField_declaration_Staticinitializer();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Method_declaration <em>Method declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.Method_declaration
   * @generated
   */
  EClass getMethod_declaration();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.myDsl.Method_declaration#getModifiersMethod <em>Modifiers Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Modifiers Method</em>'.
   * @see org.xtext.example.mydsl.myDsl.Method_declaration#getModifiersMethod()
   * @see #getMethod_declaration()
   * @generated
   */
  EAttribute getMethod_declaration_ModifiersMethod();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Method_declaration#getTypeMethod <em>Type Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Method</em>'.
   * @see org.xtext.example.mydsl.myDsl.Method_declaration#getTypeMethod()
   * @see #getMethod_declaration()
   * @generated
   */
  EReference getMethod_declaration_TypeMethod();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Method_declaration#getNameMethod <em>Name Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Method</em>'.
   * @see org.xtext.example.mydsl.myDsl.Method_declaration#getNameMethod()
   * @see #getMethod_declaration()
   * @generated
   */
  EAttribute getMethod_declaration_NameMethod();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Method_declaration#getLParen <em>LParen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>LParen</em>'.
   * @see org.xtext.example.mydsl.myDsl.Method_declaration#getLParen()
   * @see #getMethod_declaration()
   * @generated
   */
  EAttribute getMethod_declaration_LParen();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Method_declaration#getParameterListMethod <em>Parameter List Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter List Method</em>'.
   * @see org.xtext.example.mydsl.myDsl.Method_declaration#getParameterListMethod()
   * @see #getMethod_declaration()
   * @generated
   */
  EReference getMethod_declaration_ParameterListMethod();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Method_declaration#getRparent <em>Rparent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rparent</em>'.
   * @see org.xtext.example.mydsl.myDsl.Method_declaration#getRparent()
   * @see #getMethod_declaration()
   * @generated
   */
  EAttribute getMethod_declaration_Rparent();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Method_declaration#getStatementMethod <em>Statement Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement Method</em>'.
   * @see org.xtext.example.mydsl.myDsl.Method_declaration#getStatementMethod()
   * @see #getMethod_declaration()
   * @generated
   */
  EReference getMethod_declaration_StatementMethod();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Method_declaration#getDebug <em>Debug</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Debug</em>'.
   * @see org.xtext.example.mydsl.myDsl.Method_declaration#getDebug()
   * @see #getMethod_declaration()
   * @generated
   */
  EAttribute getMethod_declaration_Debug();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Constructor_declaration <em>Constructor declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constructor declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.Constructor_declaration
   * @generated
   */
  EClass getConstructor_declaration();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.myDsl.Constructor_declaration#getModifiersConstructor <em>Modifiers Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Modifiers Constructor</em>'.
   * @see org.xtext.example.mydsl.myDsl.Constructor_declaration#getModifiersConstructor()
   * @see #getConstructor_declaration()
   * @generated
   */
  EAttribute getConstructor_declaration_ModifiersConstructor();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Constructor_declaration#getNameConstructor <em>Name Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Constructor</em>'.
   * @see org.xtext.example.mydsl.myDsl.Constructor_declaration#getNameConstructor()
   * @see #getConstructor_declaration()
   * @generated
   */
  EAttribute getConstructor_declaration_NameConstructor();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Constructor_declaration#getLParen <em>LParen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>LParen</em>'.
   * @see org.xtext.example.mydsl.myDsl.Constructor_declaration#getLParen()
   * @see #getConstructor_declaration()
   * @generated
   */
  EAttribute getConstructor_declaration_LParen();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Constructor_declaration#getParameterListConstructor <em>Parameter List Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter List Constructor</em>'.
   * @see org.xtext.example.mydsl.myDsl.Constructor_declaration#getParameterListConstructor()
   * @see #getConstructor_declaration()
   * @generated
   */
  EReference getConstructor_declaration_ParameterListConstructor();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Constructor_declaration#getRparent <em>Rparent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rparent</em>'.
   * @see org.xtext.example.mydsl.myDsl.Constructor_declaration#getRparent()
   * @see #getConstructor_declaration()
   * @generated
   */
  EAttribute getConstructor_declaration_Rparent();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Constructor_declaration#getStatementConstructor <em>Statement Constructor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement Constructor</em>'.
   * @see org.xtext.example.mydsl.myDsl.Constructor_declaration#getStatementConstructor()
   * @see #getConstructor_declaration()
   * @generated
   */
  EReference getConstructor_declaration_StatementConstructor();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Parameter_list <em>Parameter list</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter list</em>'.
   * @see org.xtext.example.mydsl.myDsl.Parameter_list
   * @generated
   */
  EClass getParameter_list();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Parameter_list#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter</em>'.
   * @see org.xtext.example.mydsl.myDsl.Parameter_list#getParameter()
   * @see #getParameter_list()
   * @generated
   */
  EReference getParameter_list_Parameter();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Parameter_list#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.xtext.example.mydsl.myDsl.Parameter_list#getParameters()
   * @see #getParameter_list()
   * @generated
   */
  EReference getParameter_list_Parameters();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see org.xtext.example.mydsl.myDsl.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Parameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.Parameter#getType()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Type();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Parameter#getParameterName <em>Parameter Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Parameter Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Parameter#getParameterName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_ParameterName();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Variable_declaration <em>Variable declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.Variable_declaration
   * @generated
   */
  EClass getVariable_declaration();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.myDsl.Variable_declaration#getModifiersVariable <em>Modifiers Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Modifiers Variable</em>'.
   * @see org.xtext.example.mydsl.myDsl.Variable_declaration#getModifiersVariable()
   * @see #getVariable_declaration()
   * @generated
   */
  EAttribute getVariable_declaration_ModifiersVariable();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Variable_declaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.Variable_declaration#getType()
   * @see #getVariable_declaration()
   * @generated
   */
  EReference getVariable_declaration_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Variable_declaration#getNameVariable <em>Name Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name Variable</em>'.
   * @see org.xtext.example.mydsl.myDsl.Variable_declaration#getNameVariable()
   * @see #getVariable_declaration()
   * @generated
   */
  EReference getVariable_declaration_NameVariable();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Variable_declaration#getNames <em>Names</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Names</em>'.
   * @see org.xtext.example.mydsl.myDsl.Variable_declaration#getNames()
   * @see #getVariable_declaration()
   * @generated
   */
  EReference getVariable_declaration_Names();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Variable_declarator <em>Variable declarator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable declarator</em>'.
   * @see org.xtext.example.mydsl.myDsl.Variable_declarator
   * @generated
   */
  EClass getVariable_declarator();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Variable_declarator#getNameVariable <em>Name Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Variable</em>'.
   * @see org.xtext.example.mydsl.myDsl.Variable_declarator#getNameVariable()
   * @see #getVariable_declarator()
   * @generated
   */
  EAttribute getVariable_declarator_NameVariable();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.myDsl.Variable_declarator#getLenVector <em>Len Vector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Len Vector</em>'.
   * @see org.xtext.example.mydsl.myDsl.Variable_declarator#getLenVector()
   * @see #getVariable_declarator()
   * @generated
   */
  EAttribute getVariable_declarator_LenVector();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Variable_declarator#getVari <em>Vari</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vari</em>'.
   * @see org.xtext.example.mydsl.myDsl.Variable_declarator#getVari()
   * @see #getVariable_declarator()
   * @generated
   */
  EReference getVariable_declarator_Vari();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Variable_initializer <em>Variable initializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable initializer</em>'.
   * @see org.xtext.example.mydsl.myDsl.Variable_initializer
   * @generated
   */
  EClass getVariable_initializer();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Variable_initializer#getArray_init <em>Array init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Array init</em>'.
   * @see org.xtext.example.mydsl.myDsl.Variable_initializer#getArray_init()
   * @see #getVariable_initializer()
   * @generated
   */
  EReference getVariable_initializer_Array_init();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Variable_initializer#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Variable_initializer#getExpression()
   * @see #getVariable_initializer()
   * @generated
   */
  EReference getVariable_initializer_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Array_initializer <em>Array initializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array initializer</em>'.
   * @see org.xtext.example.mydsl.myDsl.Array_initializer
   * @generated
   */
  EClass getArray_initializer();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Array_initializer#getVariableinitializer <em>Variableinitializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variableinitializer</em>'.
   * @see org.xtext.example.mydsl.myDsl.Array_initializer#getVariableinitializer()
   * @see #getArray_initializer()
   * @generated
   */
  EReference getArray_initializer_Variableinitializer();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Type#getTypeSpecifier <em>Type Specifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Specifier</em>'.
   * @see org.xtext.example.mydsl.myDsl.Type#getTypeSpecifier()
   * @see #getType()
   * @generated
   */
  EReference getType_TypeSpecifier();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.myDsl.Type#getTypeVector <em>Type Vector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Type Vector</em>'.
   * @see org.xtext.example.mydsl.myDsl.Type#getTypeVector()
   * @see #getType()
   * @generated
   */
  EAttribute getType_TypeVector();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Type_specifier <em>Type specifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type specifier</em>'.
   * @see org.xtext.example.mydsl.myDsl.Type_specifier
   * @generated
   */
  EClass getType_specifier();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Type_specifier#getPrimitiveType <em>Primitive Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Primitive Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.Type_specifier#getPrimitiveType()
   * @see #getType_specifier()
   * @generated
   */
  EAttribute getType_specifier_PrimitiveType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Type_specifier#getClassName <em>Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Type_specifier#getClassName()
   * @see #getType_specifier()
   * @generated
   */
  EAttribute getType_specifier_ClassName();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Static_initializer <em>Static initializer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Static initializer</em>'.
   * @see org.xtext.example.mydsl.myDsl.Static_initializer
   * @generated
   */
  EClass getStatic_initializer();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Static_initializer#getStatic <em>Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Static</em>'.
   * @see org.xtext.example.mydsl.myDsl.Static_initializer#getStatic()
   * @see #getStatic_initializer()
   * @generated
   */
  EAttribute getStatic_initializer_Static();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Static_initializer#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Static_initializer#getName()
   * @see #getStatic_initializer()
   * @generated
   */
  EReference getStatic_initializer_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Statement_block <em>Statement block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement block</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement_block
   * @generated
   */
  EClass getStatement_block();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Statement_block#getRCurly <em>RCurly</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>RCurly</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement_block#getRCurly()
   * @see #getStatement_block()
   * @generated
   */
  EAttribute getStatement_block_RCurly();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Statement_block#getStatments <em>Statments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statments</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement_block#getStatments()
   * @see #getStatement_block()
   * @generated
   */
  EReference getStatement_block_Statments();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Statement_block#getLCurly <em>LCurly</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>LCurly</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement_block#getLCurly()
   * @see #getStatement_block()
   * @generated
   */
  EAttribute getStatement_block_LCurly();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Statement#getVariableDeclaration <em>Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable Declaration</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement#getVariableDeclaration()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_VariableDeclaration();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Statement#getExpressionStatement <em>Expression Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expression Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement#getExpressionStatement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_ExpressionStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Statement#getG <em>G</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>G</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement#getG()
   * @see #getStatement()
   * @generated
   */
  EAttribute getStatement_G();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Statement#getIfStatement <em>If Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement#getIfStatement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_IfStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Statement#getDoStatement <em>Do Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Do Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement#getDoStatement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_DoStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Statement#getWhileStatement <em>While Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>While Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement#getWhileStatement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_WhileStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Statement#getForStatement <em>For Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>For Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement#getForStatement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_ForStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Statement#getSwitchStatement <em>Switch Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Switch Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement#getSwitchStatement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_SwitchStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Statement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement#getExpression()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Expression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Statement#getRparent <em>Rparent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rparent</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement#getRparent()
   * @see #getStatement()
   * @generated
   */
  EAttribute getStatement_Rparent();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Statement#getSyncStatement <em>Sync Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sync Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement#getSyncStatement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_SyncStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Statement#getRet <em>Ret</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ret</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement#getRet()
   * @see #getStatement()
   * @generated
   */
  EAttribute getStatement_Ret();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Statement#getStatementBlock <em>Statement Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement Block</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement#getStatementBlock()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_StatementBlock();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Statement#getTryStatement <em>Try Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Try Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement#getTryStatement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_TryStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Statement#getNameStatement <em>Name Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement#getNameStatement()
   * @see #getStatement()
   * @generated
   */
  EAttribute getStatement_NameStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Statement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement#getStatement()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Statement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Statement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Statement#getName()
   * @see #getStatement()
   * @generated
   */
  EAttribute getStatement_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.For_Statement <em>For Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.For_Statement
   * @generated
   */
  EClass getFor_Statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.For_Statement#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see org.xtext.example.mydsl.myDsl.For_Statement#getVariable()
   * @see #getFor_Statement()
   * @generated
   */
  EReference getFor_Statement_Variable();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.For_Statement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.For_Statement#getExpression()
   * @see #getFor_Statement()
   * @generated
   */
  EReference getFor_Statement_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.For_Statement#getExpression2 <em>Expression2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression2</em>'.
   * @see org.xtext.example.mydsl.myDsl.For_Statement#getExpression2()
   * @see #getFor_Statement()
   * @generated
   */
  EReference getFor_Statement_Expression2();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.For_Statement#getExpression3 <em>Expression3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression3</em>'.
   * @see org.xtext.example.mydsl.myDsl.For_Statement#getExpression3()
   * @see #getFor_Statement()
   * @generated
   */
  EReference getFor_Statement_Expression3();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.For_Statement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.For_Statement#getStatement()
   * @see #getFor_Statement()
   * @generated
   */
  EReference getFor_Statement_Statement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Expression#getNumericExpression3 <em>Numeric Expression3</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Numeric Expression3</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression#getNumericExpression3()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_NumericExpression3();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Expression#getAux <em>Aux</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Aux</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression#getAux()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Aux();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Expression#getLogicalExpression <em>Logical Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Logical Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression#getLogicalExpression()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_LogicalExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Expression#getBitExpression <em>Bit Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Bit Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression#getBitExpression()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_BitExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Expression#getCastExpression <em>Cast Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cast Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression#getCastExpression()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_CastExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Expression#getCreatingExpression <em>Creating Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Creating Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression#getCreatingExpression()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_CreatingExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Expression#getLiteralExpression <em>Literal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Literal Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression#getLiteralExpression()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_LiteralExpression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Expression#getNull <em>Null</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Null</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression#getNull()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Null();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Expression#getSuper <em>Super</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Super</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression#getSuper()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Super();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Expression#getThis <em>This</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>This</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression#getThis()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_This();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Expression#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression#getName()
   * @see #getExpression()
   * @generated
   */
  EAttribute getExpression_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Expression_aux <em>Expression aux</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression aux</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression_aux
   * @generated
   */
  EClass getExpression_aux();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Expression_aux#getArgList <em>Arg List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg List</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression_aux#getArgList()
   * @see #getExpression_aux()
   * @generated
   */
  EReference getExpression_aux_ArgList();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Expression_aux#getAux <em>Aux</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Aux</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression_aux#getAux()
   * @see #getExpression_aux()
   * @generated
   */
  EReference getExpression_aux_Aux();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Expression_aux#getExpression2 <em>Expression2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression2</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression_aux#getExpression2()
   * @see #getExpression_aux()
   * @generated
   */
  EReference getExpression_aux_Expression2();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Expression_aux#getExpressionComma <em>Expression Comma</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression Comma</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression_aux#getExpressionComma()
   * @see #getExpression_aux()
   * @generated
   */
  EReference getExpression_aux_ExpressionComma();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Expression_aux#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression_aux#getName()
   * @see #getExpression_aux()
   * @generated
   */
  EAttribute getExpression_aux_Name();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Expression_aux#getSgin <em>Sgin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sgin</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression_aux#getSgin()
   * @see #getExpression_aux()
   * @generated
   */
  EAttribute getExpression_aux_Sgin();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Expression_aux#getNumericSign <em>Numeric Sign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Numeric Sign</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression_aux#getNumericSign()
   * @see #getExpression_aux()
   * @generated
   */
  EAttribute getExpression_aux_NumericSign();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Expression_aux#getExp2 <em>Exp2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp2</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression_aux#getExp2()
   * @see #getExpression_aux()
   * @generated
   */
  EReference getExpression_aux_Exp2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Expression_aux#getTestingSign <em>Testing Sign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Testing Sign</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression_aux#getTestingSign()
   * @see #getExpression_aux()
   * @generated
   */
  EAttribute getExpression_aux_TestingSign();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Expression_aux#getExp1 <em>Exp1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp1</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression_aux#getExp1()
   * @see #getExpression_aux()
   * @generated
   */
  EReference getExpression_aux_Exp1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Expression_aux#getLogicalSign <em>Logical Sign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Logical Sign</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression_aux#getLogicalSign()
   * @see #getExpression_aux()
   * @generated
   */
  EAttribute getExpression_aux_LogicalSign();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Expression_aux#getAmpersand <em>Ampersand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ampersand</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression_aux#getAmpersand()
   * @see #getExpression_aux()
   * @generated
   */
  EReference getExpression_aux_Ampersand();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Expression_aux#getStringSign <em>String Sign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String Sign</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression_aux#getStringSign()
   * @see #getExpression_aux()
   * @generated
   */
  EAttribute getExpression_aux_StringSign();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Expression_aux#getBitSign <em>Bit Sign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bit Sign</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression_aux#getBitSign()
   * @see #getExpression_aux()
   * @generated
   */
  EAttribute getExpression_aux_BitSign();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Expression_aux#getExpressionBit <em>Expression Bit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression Bit</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression_aux#getExpressionBit()
   * @see #getExpression_aux()
   * @generated
   */
  EReference getExpression_aux_ExpressionBit();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Expression_aux#getLogicOp <em>Logic Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Logic Op</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression_aux#getLogicOp()
   * @see #getExpression_aux()
   * @generated
   */
  EAttribute getExpression_aux_LogicOp();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Expression_aux#getLogicExp <em>Logic Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Logic Exp</em>'.
   * @see org.xtext.example.mydsl.myDsl.Expression_aux#getLogicExp()
   * @see #getExpression_aux()
   * @generated
   */
  EReference getExpression_aux_LogicExp();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Ampersand_Rule <em>Ampersand Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ampersand Rule</em>'.
   * @see org.xtext.example.mydsl.myDsl.Ampersand_Rule
   * @generated
   */
  EClass getAmpersand_Rule();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Ampersand_Rule#getA1 <em>A1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>A1</em>'.
   * @see org.xtext.example.mydsl.myDsl.Ampersand_Rule#getA1()
   * @see #getAmpersand_Rule()
   * @generated
   */
  EAttribute getAmpersand_Rule_A1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Ampersand_Rule#getA2 <em>A2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>A2</em>'.
   * @see org.xtext.example.mydsl.myDsl.Ampersand_Rule#getA2()
   * @see #getAmpersand_Rule()
   * @generated
   */
  EAttribute getAmpersand_Rule_A2();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Float_Literal <em>Float Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float Literal</em>'.
   * @see org.xtext.example.mydsl.myDsl.Float_Literal
   * @generated
   */
  EClass getFloat_Literal();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Float_Literal#getDecimalDigits1 <em>Decimal Digits1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Decimal Digits1</em>'.
   * @see org.xtext.example.mydsl.myDsl.Float_Literal#getDecimalDigits1()
   * @see #getFloat_Literal()
   * @generated
   */
  EAttribute getFloat_Literal_DecimalDigits1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Float_Literal#getDecimalDigits2 <em>Decimal Digits2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Decimal Digits2</em>'.
   * @see org.xtext.example.mydsl.myDsl.Float_Literal#getDecimalDigits2()
   * @see #getFloat_Literal()
   * @generated
   */
  EAttribute getFloat_Literal_DecimalDigits2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Float_Literal#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exp</em>'.
   * @see org.xtext.example.mydsl.myDsl.Float_Literal#getExp()
   * @see #getFloat_Literal()
   * @generated
   */
  EAttribute getFloat_Literal_Exp();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Float_Literal#getFloatTypeSufix <em>Float Type Sufix</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Float Type Sufix</em>'.
   * @see org.xtext.example.mydsl.myDsl.Float_Literal#getFloatTypeSufix()
   * @see #getFloat_Literal()
   * @generated
   */
  EAttribute getFloat_Literal_FloatTypeSufix();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Literal_Expression <em>Literal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Literal_Expression
   * @generated
   */
  EClass getLiteral_Expression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Literal_Expression#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exp</em>'.
   * @see org.xtext.example.mydsl.myDsl.Literal_Expression#getExp()
   * @see #getLiteral_Expression()
   * @generated
   */
  EAttribute getLiteral_Expression_Exp();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Literal_Expression#getExp1 <em>Exp1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exp1</em>'.
   * @see org.xtext.example.mydsl.myDsl.Literal_Expression#getExp1()
   * @see #getLiteral_Expression()
   * @generated
   */
  EAttribute getLiteral_Expression_Exp1();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Literal_Expression#getExp2 <em>Exp2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp2</em>'.
   * @see org.xtext.example.mydsl.myDsl.Literal_Expression#getExp2()
   * @see #getLiteral_Expression()
   * @generated
   */
  EReference getLiteral_Expression_Exp2();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Literal_Expression#getString <em>String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String</em>'.
   * @see org.xtext.example.mydsl.myDsl.Literal_Expression#getString()
   * @see #getLiteral_Expression()
   * @generated
   */
  EAttribute getLiteral_Expression_String();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Literal_Expression#getCharLit <em>Char Lit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Char Lit</em>'.
   * @see org.xtext.example.mydsl.myDsl.Literal_Expression#getCharLit()
   * @see #getLiteral_Expression()
   * @generated
   */
  EAttribute getLiteral_Expression_CharLit();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Creating_Expression <em>Creating Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Creating Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Creating_Expression
   * @generated
   */
  EClass getCreating_Expression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Creating_Expression#getClassName <em>Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Creating_Expression#getClassName()
   * @see #getCreating_Expression()
   * @generated
   */
  EAttribute getCreating_Expression_ClassName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Creating_Expression#getArgList <em>Arg List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg List</em>'.
   * @see org.xtext.example.mydsl.myDsl.Creating_Expression#getArgList()
   * @see #getCreating_Expression()
   * @generated
   */
  EReference getCreating_Expression_ArgList();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Creating_Expression#getTypeSpecifier <em>Type Specifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Specifier</em>'.
   * @see org.xtext.example.mydsl.myDsl.Creating_Expression#getTypeSpecifier()
   * @see #getCreating_Expression()
   * @generated
   */
  EReference getCreating_Expression_TypeSpecifier();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Creating_Expression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Creating_Expression#getExpression()
   * @see #getCreating_Expression()
   * @generated
   */
  EReference getCreating_Expression_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Cast_Expression <em>Cast Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cast Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Cast_Expression
   * @generated
   */
  EClass getCast_Expression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Cast_Expression#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.xtext.example.mydsl.myDsl.Cast_Expression#getType()
   * @see #getCast_Expression()
   * @generated
   */
  EReference getCast_Expression_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Cast_Expression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Cast_Expression#getExpression()
   * @see #getCast_Expression()
   * @generated
   */
  EReference getCast_Expression_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Bit_Expression_NR <em>Bit Expression NR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bit Expression NR</em>'.
   * @see org.xtext.example.mydsl.myDsl.Bit_Expression_NR
   * @generated
   */
  EClass getBit_Expression_NR();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Bit_Expression_NR#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Bit_Expression_NR#getExpression()
   * @see #getBit_Expression_NR()
   * @generated
   */
  EReference getBit_Expression_NR_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Logical_Expression_NR <em>Logical Expression NR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Logical Expression NR</em>'.
   * @see org.xtext.example.mydsl.myDsl.Logical_Expression_NR
   * @generated
   */
  EClass getLogical_Expression_NR();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Logical_Expression_NR#getExclamation <em>Exclamation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exclamation</em>'.
   * @see org.xtext.example.mydsl.myDsl.Logical_Expression_NR#getExclamation()
   * @see #getLogical_Expression_NR()
   * @generated
   */
  EAttribute getLogical_Expression_NR_Exclamation();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Logical_Expression_NR#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Logical_Expression_NR#getExpression()
   * @see #getLogical_Expression_NR()
   * @generated
   */
  EReference getLogical_Expression_NR_Expression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Logical_Expression_NR#getTrue <em>True</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>True</em>'.
   * @see org.xtext.example.mydsl.myDsl.Logical_Expression_NR#getTrue()
   * @see #getLogical_Expression_NR()
   * @generated
   */
  EAttribute getLogical_Expression_NR_True();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Logical_Expression_NR#getFalse <em>False</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>False</em>'.
   * @see org.xtext.example.mydsl.myDsl.Logical_Expression_NR#getFalse()
   * @see #getLogical_Expression_NR()
   * @generated
   */
  EAttribute getLogical_Expression_NR_False();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Arg_List <em>Arg List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arg List</em>'.
   * @see org.xtext.example.mydsl.myDsl.Arg_List
   * @generated
   */
  EClass getArg_List();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Arg_List#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Arg_List#getExpression()
   * @see #getArg_List()
   * @generated
   */
  EReference getArg_List_Expression();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Arg_List#getExpressions <em>Expressions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expressions</em>'.
   * @see org.xtext.example.mydsl.myDsl.Arg_List#getExpressions()
   * @see #getArg_List()
   * @generated
   */
  EReference getArg_List_Expressions();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Numeric_Expression_NR <em>Numeric Expression NR</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Numeric Expression NR</em>'.
   * @see org.xtext.example.mydsl.myDsl.Numeric_Expression_NR
   * @generated
   */
  EClass getNumeric_Expression_NR();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Numeric_Expression_NR#getSinal_numeric <em>Sinal numeric</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sinal numeric</em>'.
   * @see org.xtext.example.mydsl.myDsl.Numeric_Expression_NR#getSinal_numeric()
   * @see #getNumeric_Expression_NR()
   * @generated
   */
  EAttribute getNumeric_Expression_NR_Sinal_numeric();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Numeric_Expression_NR#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Numeric_Expression_NR#getExpression()
   * @see #getNumeric_Expression_NR()
   * @generated
   */
  EReference getNumeric_Expression_NR_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Switch_statement <em>Switch statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Switch_statement
   * @generated
   */
  EClass getSwitch_statement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Switch_statement#getLParen <em>LParen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>LParen</em>'.
   * @see org.xtext.example.mydsl.myDsl.Switch_statement#getLParen()
   * @see #getSwitch_statement()
   * @generated
   */
  EAttribute getSwitch_statement_LParen();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Switch_statement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.Switch_statement#getExpression()
   * @see #getSwitch_statement()
   * @generated
   */
  EReference getSwitch_statement_Expression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Switch_statement#getRparent <em>Rparent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rparent</em>'.
   * @see org.xtext.example.mydsl.myDsl.Switch_statement#getRparent()
   * @see #getSwitch_statement()
   * @generated
   */
  EAttribute getSwitch_statement_Rparent();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Switch_statement#getExpression2 <em>Expression2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Expression2</em>'.
   * @see org.xtext.example.mydsl.myDsl.Switch_statement#getExpression2()
   * @see #getSwitch_statement()
   * @generated
   */
  EReference getSwitch_statement_Expression2();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Switch_statement#getSwitchStatements <em>Switch Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Switch Statements</em>'.
   * @see org.xtext.example.mydsl.myDsl.Switch_statement#getSwitchStatements()
   * @see #getSwitch_statement()
   * @generated
   */
  EReference getSwitch_statement_SwitchStatements();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.While_Statement <em>While Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>While Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.While_Statement
   * @generated
   */
  EClass getWhile_Statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.While_Statement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.While_Statement#getExpression()
   * @see #getWhile_Statement()
   * @generated
   */
  EReference getWhile_Statement_Expression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.While_Statement#getRparent <em>Rparent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rparent</em>'.
   * @see org.xtext.example.mydsl.myDsl.While_Statement#getRparent()
   * @see #getWhile_Statement()
   * @generated
   */
  EAttribute getWhile_Statement_Rparent();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.While_Statement#getWhileStatement <em>While Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>While Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.While_Statement#getWhileStatement()
   * @see #getWhile_Statement()
   * @generated
   */
  EReference getWhile_Statement_WhileStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Do_Statement <em>Do Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Do Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Do_Statement
   * @generated
   */
  EClass getDo_Statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Do_Statement#getDoStatement <em>Do Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Do Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Do_Statement#getDoStatement()
   * @see #getDo_Statement()
   * @generated
   */
  EReference getDo_Statement_DoStatement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Do_Statement#getLparent <em>Lparent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lparent</em>'.
   * @see org.xtext.example.mydsl.myDsl.Do_Statement#getLparent()
   * @see #getDo_Statement()
   * @generated
   */
  EAttribute getDo_Statement_Lparent();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Do_Statement#getRparent <em>Rparent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rparent</em>'.
   * @see org.xtext.example.mydsl.myDsl.Do_Statement#getRparent()
   * @see #getDo_Statement()
   * @generated
   */
  EAttribute getDo_Statement_Rparent();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.If_statement <em>If statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.If_statement
   * @generated
   */
  EClass getIf_statement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.If_statement#getLparen <em>Lparen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lparen</em>'.
   * @see org.xtext.example.mydsl.myDsl.If_statement#getLparen()
   * @see #getIf_statement()
   * @generated
   */
  EAttribute getIf_statement_Lparen();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.If_statement#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.example.mydsl.myDsl.If_statement#getExpression()
   * @see #getIf_statement()
   * @generated
   */
  EReference getIf_statement_Expression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.If_statement#getRparent <em>Rparent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rparent</em>'.
   * @see org.xtext.example.mydsl.myDsl.If_statement#getRparent()
   * @see #getIf_statement()
   * @generated
   */
  EAttribute getIf_statement_Rparent();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.If_statement#getIdStatement <em>Id Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.If_statement#getIdStatement()
   * @see #getIf_statement()
   * @generated
   */
  EReference getIf_statement_IdStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.If_statement#getElseStatement <em>Else Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.If_statement#getElseStatement()
   * @see #getIf_statement()
   * @generated
   */
  EReference getIf_statement_ElseStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Try_statement <em>Try statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Try statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Try_statement
   * @generated
   */
  EClass getTry_statement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Try_statement#getTryStatement <em>Try Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Try Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Try_statement#getTryStatement()
   * @see #getTry_statement()
   * @generated
   */
  EReference getTry_statement_TryStatement();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.myDsl.Try_statement#getLParen <em>LParen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>LParen</em>'.
   * @see org.xtext.example.mydsl.myDsl.Try_statement#getLParen()
   * @see #getTry_statement()
   * @generated
   */
  EAttribute getTry_statement_LParen();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Try_statement#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.xtext.example.mydsl.myDsl.Try_statement#getParameters()
   * @see #getTry_statement()
   * @generated
   */
  EReference getTry_statement_Parameters();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.myDsl.Try_statement#getRparent <em>Rparent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Rparent</em>'.
   * @see org.xtext.example.mydsl.myDsl.Try_statement#getRparent()
   * @see #getTry_statement()
   * @generated
   */
  EAttribute getTry_statement_Rparent();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.myDsl.Try_statement#getCatchStatement <em>Catch Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Catch Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Try_statement#getCatchStatement()
   * @see #getTry_statement()
   * @generated
   */
  EReference getTry_statement_CatchStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Try_statement#getFinallyStatement <em>Finally Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Finally Statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Try_statement#getFinallyStatement()
   * @see #getTry_statement()
   * @generated
   */
  EReference getTry_statement_FinallyStatement();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Import_statement <em>Import statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Import_statement
   * @generated
   */
  EClass getImport_statement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Import_statement#getClassName <em>Class Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Import_statement#getClassName()
   * @see #getImport_statement()
   * @generated
   */
  EAttribute getImport_statement_ClassName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Import_statement#getPacName <em>Pac Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pac Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Import_statement#getPacName()
   * @see #getImport_statement()
   * @generated
   */
  EAttribute getImport_statement_PacName();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Package_statement <em>Package statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Package statement</em>'.
   * @see org.xtext.example.mydsl.myDsl.Package_statement
   * @generated
   */
  EClass getPackage_statement();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.Package_statement#getPacName <em>Pac Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pac Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.Package_statement#getPacName()
   * @see #getPackage_statement()
   * @generated
   */
  EAttribute getPackage_statement_PacName();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ModelImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Greetings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__GREETINGS = eINSTANCE.getModel_Greetings();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Compilation_unitImpl <em>Compilation unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Compilation_unitImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCompilation_unit()
     * @generated
     */
    EClass COMPILATION_UNIT = eINSTANCE.getCompilation_unit();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPILATION_UNIT__NAME = eINSTANCE.getCompilation_unit_Name();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPILATION_UNIT__IMPORTS = eINSTANCE.getCompilation_unit_Imports();

    /**
     * The meta object literal for the '<em><b>Type Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPILATION_UNIT__TYPE_DECLARATIONS = eINSTANCE.getCompilation_unit_TypeDeclarations();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Type_declarationImpl <em>Type declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Type_declarationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getType_declaration()
     * @generated
     */
    EClass TYPE_DECLARATION = eINSTANCE.getType_declaration();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_DECLARATION__COMMENT = eINSTANCE.getType_declaration_Comment();

    /**
     * The meta object literal for the '<em><b>Class Dec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DECLARATION__CLASS_DEC = eINSTANCE.getType_declaration_ClassDec();

    /**
     * The meta object literal for the '<em><b>Interface Dec</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_DECLARATION__INTERFACE_DEC = eINSTANCE.getType_declaration_InterfaceDec();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Interface_declarationImpl <em>Interface declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Interface_declarationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getInterface_declaration()
     * @generated
     */
    EClass INTERFACE_DECLARATION = eINSTANCE.getInterface_declaration();

    /**
     * The meta object literal for the '<em><b>Modifiers</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE_DECLARATION__MODIFIERS = eINSTANCE.getInterface_declaration_Modifiers();

    /**
     * The meta object literal for the '<em><b>Interface Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE_DECLARATION__INTERFACE_NAME = eINSTANCE.getInterface_declaration_InterfaceName();

    /**
     * The meta object literal for the '<em><b>Interface Herdada</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE_DECLARATION__INTERFACE_HERDADA = eINSTANCE.getInterface_declaration_InterfaceHerdada();

    /**
     * The meta object literal for the '<em><b>Interfaces Herdadas</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTERFACE_DECLARATION__INTERFACES_HERDADAS = eINSTANCE.getInterface_declaration_InterfacesHerdadas();

    /**
     * The meta object literal for the '<em><b>Fields Declaration</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTERFACE_DECLARATION__FIELDS_DECLARATION = eINSTANCE.getInterface_declaration_FieldsDeclaration();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Class_declarationImpl <em>Class declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Class_declarationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getClass_declaration()
     * @generated
     */
    EClass CLASS_DECLARATION = eINSTANCE.getClass_declaration();

    /**
     * The meta object literal for the '<em><b>Modifiers</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_DECLARATION__MODIFIERS = eINSTANCE.getClass_declaration_Modifiers();

    /**
     * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_DECLARATION__CLASS_NAME = eINSTANCE.getClass_declaration_ClassName();

    /**
     * The meta object literal for the '<em><b>Class Herdada</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_DECLARATION__CLASS_HERDADA = eINSTANCE.getClass_declaration_ClassHerdada();

    /**
     * The meta object literal for the '<em><b>Interface Implementada</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_DECLARATION__INTERFACE_IMPLEMENTADA = eINSTANCE.getClass_declaration_InterfaceImplementada();

    /**
     * The meta object literal for the '<em><b>Interfaces Implementadas</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS_DECLARATION__INTERFACES_IMPLEMENTADAS = eINSTANCE.getClass_declaration_InterfacesImplementadas();

    /**
     * The meta object literal for the '<em><b>Fields Declaration</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS_DECLARATION__FIELDS_DECLARATION = eINSTANCE.getClass_declaration_FieldsDeclaration();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Field_declarationImpl <em>Field declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Field_declarationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getField_declaration()
     * @generated
     */
    EClass FIELD_DECLARATION = eINSTANCE.getField_declaration();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_DECLARATION__COMMENT = eINSTANCE.getField_declaration_Comment();

    /**
     * The meta object literal for the '<em><b>Variable Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_DECLARATION__VARIABLE_DECLARATION = eINSTANCE.getField_declaration_VariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Contructor Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_DECLARATION__CONTRUCTOR_NAME = eINSTANCE.getField_declaration_ContructorName();

    /**
     * The meta object literal for the '<em><b>Method Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_DECLARATION__METHOD_NAME = eINSTANCE.getField_declaration_MethodName();

    /**
     * The meta object literal for the '<em><b>Staticinitializer</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_DECLARATION__STATICINITIALIZER = eINSTANCE.getField_declaration_Staticinitializer();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Method_declarationImpl <em>Method declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Method_declarationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getMethod_declaration()
     * @generated
     */
    EClass METHOD_DECLARATION = eINSTANCE.getMethod_declaration();

    /**
     * The meta object literal for the '<em><b>Modifiers Method</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_DECLARATION__MODIFIERS_METHOD = eINSTANCE.getMethod_declaration_ModifiersMethod();

    /**
     * The meta object literal for the '<em><b>Type Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DECLARATION__TYPE_METHOD = eINSTANCE.getMethod_declaration_TypeMethod();

    /**
     * The meta object literal for the '<em><b>Name Method</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_DECLARATION__NAME_METHOD = eINSTANCE.getMethod_declaration_NameMethod();

    /**
     * The meta object literal for the '<em><b>LParen</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_DECLARATION__LPAREN = eINSTANCE.getMethod_declaration_LParen();

    /**
     * The meta object literal for the '<em><b>Parameter List Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DECLARATION__PARAMETER_LIST_METHOD = eINSTANCE.getMethod_declaration_ParameterListMethod();

    /**
     * The meta object literal for the '<em><b>Rparent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_DECLARATION__RPARENT = eINSTANCE.getMethod_declaration_Rparent();

    /**
     * The meta object literal for the '<em><b>Statement Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_DECLARATION__STATEMENT_METHOD = eINSTANCE.getMethod_declaration_StatementMethod();

    /**
     * The meta object literal for the '<em><b>Debug</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METHOD_DECLARATION__DEBUG = eINSTANCE.getMethod_declaration_Debug();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Constructor_declarationImpl <em>Constructor declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Constructor_declarationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getConstructor_declaration()
     * @generated
     */
    EClass CONSTRUCTOR_DECLARATION = eINSTANCE.getConstructor_declaration();

    /**
     * The meta object literal for the '<em><b>Modifiers Constructor</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRUCTOR_DECLARATION__MODIFIERS_CONSTRUCTOR = eINSTANCE.getConstructor_declaration_ModifiersConstructor();

    /**
     * The meta object literal for the '<em><b>Name Constructor</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRUCTOR_DECLARATION__NAME_CONSTRUCTOR = eINSTANCE.getConstructor_declaration_NameConstructor();

    /**
     * The meta object literal for the '<em><b>LParen</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRUCTOR_DECLARATION__LPAREN = eINSTANCE.getConstructor_declaration_LParen();

    /**
     * The meta object literal for the '<em><b>Parameter List Constructor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR_DECLARATION__PARAMETER_LIST_CONSTRUCTOR = eINSTANCE.getConstructor_declaration_ParameterListConstructor();

    /**
     * The meta object literal for the '<em><b>Rparent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONSTRUCTOR_DECLARATION__RPARENT = eINSTANCE.getConstructor_declaration_Rparent();

    /**
     * The meta object literal for the '<em><b>Statement Constructor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR_DECLARATION__STATEMENT_CONSTRUCTOR = eINSTANCE.getConstructor_declaration_StatementConstructor();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Parameter_listImpl <em>Parameter list</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Parameter_listImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getParameter_list()
     * @generated
     */
    EClass PARAMETER_LIST = eINSTANCE.getParameter_list();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_LIST__PARAMETER = eINSTANCE.getParameter_list_Parameter();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_LIST__PARAMETERS = eINSTANCE.getParameter_list_Parameters();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ParameterImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

    /**
     * The meta object literal for the '<em><b>Parameter Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__PARAMETER_NAME = eINSTANCE.getParameter_ParameterName();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Variable_declarationImpl <em>Variable declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Variable_declarationImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVariable_declaration()
     * @generated
     */
    EClass VARIABLE_DECLARATION = eINSTANCE.getVariable_declaration();

    /**
     * The meta object literal for the '<em><b>Modifiers Variable</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECLARATION__MODIFIERS_VARIABLE = eINSTANCE.getVariable_declaration_ModifiersVariable();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION__TYPE = eINSTANCE.getVariable_declaration_Type();

    /**
     * The meta object literal for the '<em><b>Name Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION__NAME_VARIABLE = eINSTANCE.getVariable_declaration_NameVariable();

    /**
     * The meta object literal for the '<em><b>Names</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATION__NAMES = eINSTANCE.getVariable_declaration_Names();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Variable_declaratorImpl <em>Variable declarator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Variable_declaratorImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVariable_declarator()
     * @generated
     */
    EClass VARIABLE_DECLARATOR = eINSTANCE.getVariable_declarator();

    /**
     * The meta object literal for the '<em><b>Name Variable</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECLARATOR__NAME_VARIABLE = eINSTANCE.getVariable_declarator_NameVariable();

    /**
     * The meta object literal for the '<em><b>Len Vector</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECLARATOR__LEN_VECTOR = eINSTANCE.getVariable_declarator_LenVector();

    /**
     * The meta object literal for the '<em><b>Vari</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECLARATOR__VARI = eINSTANCE.getVariable_declarator_Vari();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Variable_initializerImpl <em>Variable initializer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Variable_initializerImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getVariable_initializer()
     * @generated
     */
    EClass VARIABLE_INITIALIZER = eINSTANCE.getVariable_initializer();

    /**
     * The meta object literal for the '<em><b>Array init</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_INITIALIZER__ARRAY_INIT = eINSTANCE.getVariable_initializer_Array_init();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_INITIALIZER__EXPRESSION = eINSTANCE.getVariable_initializer_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Array_initializerImpl <em>Array initializer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Array_initializerImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getArray_initializer()
     * @generated
     */
    EClass ARRAY_INITIALIZER = eINSTANCE.getArray_initializer();

    /**
     * The meta object literal for the '<em><b>Variableinitializer</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_INITIALIZER__VARIABLEINITIALIZER = eINSTANCE.getArray_initializer_Variableinitializer();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.TypeImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Type Specifier</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__TYPE_SPECIFIER = eINSTANCE.getType_TypeSpecifier();

    /**
     * The meta object literal for the '<em><b>Type Vector</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__TYPE_VECTOR = eINSTANCE.getType_TypeVector();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Type_specifierImpl <em>Type specifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Type_specifierImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getType_specifier()
     * @generated
     */
    EClass TYPE_SPECIFIER = eINSTANCE.getType_specifier();

    /**
     * The meta object literal for the '<em><b>Primitive Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_SPECIFIER__PRIMITIVE_TYPE = eINSTANCE.getType_specifier_PrimitiveType();

    /**
     * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_SPECIFIER__CLASS_NAME = eINSTANCE.getType_specifier_ClassName();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Static_initializerImpl <em>Static initializer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Static_initializerImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getStatic_initializer()
     * @generated
     */
    EClass STATIC_INITIALIZER = eINSTANCE.getStatic_initializer();

    /**
     * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATIC_INITIALIZER__STATIC = eINSTANCE.getStatic_initializer_Static();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATIC_INITIALIZER__NAME = eINSTANCE.getStatic_initializer_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Statement_blockImpl <em>Statement block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Statement_blockImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getStatement_block()
     * @generated
     */
    EClass STATEMENT_BLOCK = eINSTANCE.getStatement_block();

    /**
     * The meta object literal for the '<em><b>RCurly</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT_BLOCK__RCURLY = eINSTANCE.getStatement_block_RCurly();

    /**
     * The meta object literal for the '<em><b>Statments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT_BLOCK__STATMENTS = eINSTANCE.getStatement_block_Statments();

    /**
     * The meta object literal for the '<em><b>LCurly</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT_BLOCK__LCURLY = eINSTANCE.getStatement_block_LCurly();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.StatementImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '<em><b>Variable Declaration</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__VARIABLE_DECLARATION = eINSTANCE.getStatement_VariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Expression Statement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__EXPRESSION_STATEMENT = eINSTANCE.getStatement_ExpressionStatement();

    /**
     * The meta object literal for the '<em><b>G</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__G = eINSTANCE.getStatement_G();

    /**
     * The meta object literal for the '<em><b>If Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__IF_STATEMENT = eINSTANCE.getStatement_IfStatement();

    /**
     * The meta object literal for the '<em><b>Do Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__DO_STATEMENT = eINSTANCE.getStatement_DoStatement();

    /**
     * The meta object literal for the '<em><b>While Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__WHILE_STATEMENT = eINSTANCE.getStatement_WhileStatement();

    /**
     * The meta object literal for the '<em><b>For Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__FOR_STATEMENT = eINSTANCE.getStatement_ForStatement();

    /**
     * The meta object literal for the '<em><b>Switch Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__SWITCH_STATEMENT = eINSTANCE.getStatement_SwitchStatement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__EXPRESSION = eINSTANCE.getStatement_Expression();

    /**
     * The meta object literal for the '<em><b>Rparent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__RPARENT = eINSTANCE.getStatement_Rparent();

    /**
     * The meta object literal for the '<em><b>Sync Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__SYNC_STATEMENT = eINSTANCE.getStatement_SyncStatement();

    /**
     * The meta object literal for the '<em><b>Ret</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__RET = eINSTANCE.getStatement_Ret();

    /**
     * The meta object literal for the '<em><b>Statement Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__STATEMENT_BLOCK = eINSTANCE.getStatement_StatementBlock();

    /**
     * The meta object literal for the '<em><b>Try Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__TRY_STATEMENT = eINSTANCE.getStatement_TryStatement();

    /**
     * The meta object literal for the '<em><b>Name Statement</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__NAME_STATEMENT = eINSTANCE.getStatement_NameStatement();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__STATEMENT = eINSTANCE.getStatement_Statement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATEMENT__NAME = eINSTANCE.getStatement_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.For_StatementImpl <em>For Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.For_StatementImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFor_Statement()
     * @generated
     */
    EClass FOR_STATEMENT = eINSTANCE.getFor_Statement();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__VARIABLE = eINSTANCE.getFor_Statement_Variable();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__EXPRESSION = eINSTANCE.getFor_Statement_Expression();

    /**
     * The meta object literal for the '<em><b>Expression2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__EXPRESSION2 = eINSTANCE.getFor_Statement_Expression2();

    /**
     * The meta object literal for the '<em><b>Expression3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__EXPRESSION3 = eINSTANCE.getFor_Statement_Expression3();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_STATEMENT__STATEMENT = eINSTANCE.getFor_Statement_Statement();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ExpressionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Numeric Expression3</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__NUMERIC_EXPRESSION3 = eINSTANCE.getExpression_NumericExpression3();

    /**
     * The meta object literal for the '<em><b>Aux</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__AUX = eINSTANCE.getExpression_Aux();

    /**
     * The meta object literal for the '<em><b>Logical Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__LOGICAL_EXPRESSION = eINSTANCE.getExpression_LogicalExpression();

    /**
     * The meta object literal for the '<em><b>Bit Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__BIT_EXPRESSION = eINSTANCE.getExpression_BitExpression();

    /**
     * The meta object literal for the '<em><b>Cast Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__CAST_EXPRESSION = eINSTANCE.getExpression_CastExpression();

    /**
     * The meta object literal for the '<em><b>Creating Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__CREATING_EXPRESSION = eINSTANCE.getExpression_CreatingExpression();

    /**
     * The meta object literal for the '<em><b>Literal Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__LITERAL_EXPRESSION = eINSTANCE.getExpression_LiteralExpression();

    /**
     * The meta object literal for the '<em><b>Null</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__NULL = eINSTANCE.getExpression_Null();

    /**
     * The meta object literal for the '<em><b>Super</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__SUPER = eINSTANCE.getExpression_Super();

    /**
     * The meta object literal for the '<em><b>This</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__THIS = eINSTANCE.getExpression_This();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION__NAME = eINSTANCE.getExpression_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Expression_auxImpl <em>Expression aux</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Expression_auxImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getExpression_aux()
     * @generated
     */
    EClass EXPRESSION_AUX = eINSTANCE.getExpression_aux();

    /**
     * The meta object literal for the '<em><b>Arg List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_AUX__ARG_LIST = eINSTANCE.getExpression_aux_ArgList();

    /**
     * The meta object literal for the '<em><b>Aux</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_AUX__AUX = eINSTANCE.getExpression_aux_Aux();

    /**
     * The meta object literal for the '<em><b>Expression2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_AUX__EXPRESSION2 = eINSTANCE.getExpression_aux_Expression2();

    /**
     * The meta object literal for the '<em><b>Expression Comma</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_AUX__EXPRESSION_COMMA = eINSTANCE.getExpression_aux_ExpressionComma();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION_AUX__NAME = eINSTANCE.getExpression_aux_Name();

    /**
     * The meta object literal for the '<em><b>Sgin</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION_AUX__SGIN = eINSTANCE.getExpression_aux_Sgin();

    /**
     * The meta object literal for the '<em><b>Numeric Sign</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION_AUX__NUMERIC_SIGN = eINSTANCE.getExpression_aux_NumericSign();

    /**
     * The meta object literal for the '<em><b>Exp2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_AUX__EXP2 = eINSTANCE.getExpression_aux_Exp2();

    /**
     * The meta object literal for the '<em><b>Testing Sign</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION_AUX__TESTING_SIGN = eINSTANCE.getExpression_aux_TestingSign();

    /**
     * The meta object literal for the '<em><b>Exp1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_AUX__EXP1 = eINSTANCE.getExpression_aux_Exp1();

    /**
     * The meta object literal for the '<em><b>Logical Sign</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION_AUX__LOGICAL_SIGN = eINSTANCE.getExpression_aux_LogicalSign();

    /**
     * The meta object literal for the '<em><b>Ampersand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_AUX__AMPERSAND = eINSTANCE.getExpression_aux_Ampersand();

    /**
     * The meta object literal for the '<em><b>String Sign</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION_AUX__STRING_SIGN = eINSTANCE.getExpression_aux_StringSign();

    /**
     * The meta object literal for the '<em><b>Bit Sign</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION_AUX__BIT_SIGN = eINSTANCE.getExpression_aux_BitSign();

    /**
     * The meta object literal for the '<em><b>Expression Bit</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_AUX__EXPRESSION_BIT = eINSTANCE.getExpression_aux_ExpressionBit();

    /**
     * The meta object literal for the '<em><b>Logic Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXPRESSION_AUX__LOGIC_OP = eINSTANCE.getExpression_aux_LogicOp();

    /**
     * The meta object literal for the '<em><b>Logic Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_AUX__LOGIC_EXP = eINSTANCE.getExpression_aux_LogicExp();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Ampersand_RuleImpl <em>Ampersand Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Ampersand_RuleImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getAmpersand_Rule()
     * @generated
     */
    EClass AMPERSAND_RULE = eINSTANCE.getAmpersand_Rule();

    /**
     * The meta object literal for the '<em><b>A1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AMPERSAND_RULE__A1 = eINSTANCE.getAmpersand_Rule_A1();

    /**
     * The meta object literal for the '<em><b>A2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AMPERSAND_RULE__A2 = eINSTANCE.getAmpersand_Rule_A2();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Float_LiteralImpl <em>Float Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Float_LiteralImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getFloat_Literal()
     * @generated
     */
    EClass FLOAT_LITERAL = eINSTANCE.getFloat_Literal();

    /**
     * The meta object literal for the '<em><b>Decimal Digits1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOAT_LITERAL__DECIMAL_DIGITS1 = eINSTANCE.getFloat_Literal_DecimalDigits1();

    /**
     * The meta object literal for the '<em><b>Decimal Digits2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOAT_LITERAL__DECIMAL_DIGITS2 = eINSTANCE.getFloat_Literal_DecimalDigits2();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOAT_LITERAL__EXP = eINSTANCE.getFloat_Literal_Exp();

    /**
     * The meta object literal for the '<em><b>Float Type Sufix</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOAT_LITERAL__FLOAT_TYPE_SUFIX = eINSTANCE.getFloat_Literal_FloatTypeSufix();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Literal_ExpressionImpl <em>Literal Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Literal_ExpressionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getLiteral_Expression()
     * @generated
     */
    EClass LITERAL_EXPRESSION = eINSTANCE.getLiteral_Expression();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL_EXPRESSION__EXP = eINSTANCE.getLiteral_Expression_Exp();

    /**
     * The meta object literal for the '<em><b>Exp1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL_EXPRESSION__EXP1 = eINSTANCE.getLiteral_Expression_Exp1();

    /**
     * The meta object literal for the '<em><b>Exp2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LITERAL_EXPRESSION__EXP2 = eINSTANCE.getLiteral_Expression_Exp2();

    /**
     * The meta object literal for the '<em><b>String</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL_EXPRESSION__STRING = eINSTANCE.getLiteral_Expression_String();

    /**
     * The meta object literal for the '<em><b>Char Lit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL_EXPRESSION__CHAR_LIT = eINSTANCE.getLiteral_Expression_CharLit();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Creating_ExpressionImpl <em>Creating Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Creating_ExpressionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCreating_Expression()
     * @generated
     */
    EClass CREATING_EXPRESSION = eINSTANCE.getCreating_Expression();

    /**
     * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CREATING_EXPRESSION__CLASS_NAME = eINSTANCE.getCreating_Expression_ClassName();

    /**
     * The meta object literal for the '<em><b>Arg List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATING_EXPRESSION__ARG_LIST = eINSTANCE.getCreating_Expression_ArgList();

    /**
     * The meta object literal for the '<em><b>Type Specifier</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATING_EXPRESSION__TYPE_SPECIFIER = eINSTANCE.getCreating_Expression_TypeSpecifier();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CREATING_EXPRESSION__EXPRESSION = eINSTANCE.getCreating_Expression_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Cast_ExpressionImpl <em>Cast Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Cast_ExpressionImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCast_Expression()
     * @generated
     */
    EClass CAST_EXPRESSION = eINSTANCE.getCast_Expression();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAST_EXPRESSION__TYPE = eINSTANCE.getCast_Expression_Type();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAST_EXPRESSION__EXPRESSION = eINSTANCE.getCast_Expression_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Bit_Expression_NRImpl <em>Bit Expression NR</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Bit_Expression_NRImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBit_Expression_NR()
     * @generated
     */
    EClass BIT_EXPRESSION_NR = eINSTANCE.getBit_Expression_NR();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BIT_EXPRESSION_NR__EXPRESSION = eINSTANCE.getBit_Expression_NR_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Logical_Expression_NRImpl <em>Logical Expression NR</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Logical_Expression_NRImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getLogical_Expression_NR()
     * @generated
     */
    EClass LOGICAL_EXPRESSION_NR = eINSTANCE.getLogical_Expression_NR();

    /**
     * The meta object literal for the '<em><b>Exclamation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOGICAL_EXPRESSION_NR__EXCLAMATION = eINSTANCE.getLogical_Expression_NR_Exclamation();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGICAL_EXPRESSION_NR__EXPRESSION = eINSTANCE.getLogical_Expression_NR_Expression();

    /**
     * The meta object literal for the '<em><b>True</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOGICAL_EXPRESSION_NR__TRUE = eINSTANCE.getLogical_Expression_NR_True();

    /**
     * The meta object literal for the '<em><b>False</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOGICAL_EXPRESSION_NR__FALSE = eINSTANCE.getLogical_Expression_NR_False();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Arg_ListImpl <em>Arg List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Arg_ListImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getArg_List()
     * @generated
     */
    EClass ARG_LIST = eINSTANCE.getArg_List();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARG_LIST__EXPRESSION = eINSTANCE.getArg_List_Expression();

    /**
     * The meta object literal for the '<em><b>Expressions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARG_LIST__EXPRESSIONS = eINSTANCE.getArg_List_Expressions();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Numeric_Expression_NRImpl <em>Numeric Expression NR</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Numeric_Expression_NRImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getNumeric_Expression_NR()
     * @generated
     */
    EClass NUMERIC_EXPRESSION_NR = eINSTANCE.getNumeric_Expression_NR();

    /**
     * The meta object literal for the '<em><b>Sinal numeric</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NUMERIC_EXPRESSION_NR__SINAL_NUMERIC = eINSTANCE.getNumeric_Expression_NR_Sinal_numeric();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NUMERIC_EXPRESSION_NR__EXPRESSION = eINSTANCE.getNumeric_Expression_NR_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Switch_statementImpl <em>Switch statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Switch_statementImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getSwitch_statement()
     * @generated
     */
    EClass SWITCH_STATEMENT = eINSTANCE.getSwitch_statement();

    /**
     * The meta object literal for the '<em><b>LParen</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SWITCH_STATEMENT__LPAREN = eINSTANCE.getSwitch_statement_LParen();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_STATEMENT__EXPRESSION = eINSTANCE.getSwitch_statement_Expression();

    /**
     * The meta object literal for the '<em><b>Rparent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SWITCH_STATEMENT__RPARENT = eINSTANCE.getSwitch_statement_Rparent();

    /**
     * The meta object literal for the '<em><b>Expression2</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_STATEMENT__EXPRESSION2 = eINSTANCE.getSwitch_statement_Expression2();

    /**
     * The meta object literal for the '<em><b>Switch Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_STATEMENT__SWITCH_STATEMENTS = eINSTANCE.getSwitch_statement_SwitchStatements();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.While_StatementImpl <em>While Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.While_StatementImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getWhile_Statement()
     * @generated
     */
    EClass WHILE_STATEMENT = eINSTANCE.getWhile_Statement();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_STATEMENT__EXPRESSION = eINSTANCE.getWhile_Statement_Expression();

    /**
     * The meta object literal for the '<em><b>Rparent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WHILE_STATEMENT__RPARENT = eINSTANCE.getWhile_Statement_Rparent();

    /**
     * The meta object literal for the '<em><b>While Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WHILE_STATEMENT__WHILE_STATEMENT = eINSTANCE.getWhile_Statement_WhileStatement();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Do_StatementImpl <em>Do Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Do_StatementImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getDo_Statement()
     * @generated
     */
    EClass DO_STATEMENT = eINSTANCE.getDo_Statement();

    /**
     * The meta object literal for the '<em><b>Do Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DO_STATEMENT__DO_STATEMENT = eINSTANCE.getDo_Statement_DoStatement();

    /**
     * The meta object literal for the '<em><b>Lparent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DO_STATEMENT__LPARENT = eINSTANCE.getDo_Statement_Lparent();

    /**
     * The meta object literal for the '<em><b>Rparent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DO_STATEMENT__RPARENT = eINSTANCE.getDo_Statement_Rparent();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.If_statementImpl <em>If statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.If_statementImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getIf_statement()
     * @generated
     */
    EClass IF_STATEMENT = eINSTANCE.getIf_statement();

    /**
     * The meta object literal for the '<em><b>Lparen</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IF_STATEMENT__LPAREN = eINSTANCE.getIf_statement_Lparen();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__EXPRESSION = eINSTANCE.getIf_statement_Expression();

    /**
     * The meta object literal for the '<em><b>Rparent</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IF_STATEMENT__RPARENT = eINSTANCE.getIf_statement_Rparent();

    /**
     * The meta object literal for the '<em><b>Id Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__ID_STATEMENT = eINSTANCE.getIf_statement_IdStatement();

    /**
     * The meta object literal for the '<em><b>Else Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IF_STATEMENT__ELSE_STATEMENT = eINSTANCE.getIf_statement_ElseStatement();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Try_statementImpl <em>Try statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Try_statementImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getTry_statement()
     * @generated
     */
    EClass TRY_STATEMENT = eINSTANCE.getTry_statement();

    /**
     * The meta object literal for the '<em><b>Try Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRY_STATEMENT__TRY_STATEMENT = eINSTANCE.getTry_statement_TryStatement();

    /**
     * The meta object literal for the '<em><b>LParen</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRY_STATEMENT__LPAREN = eINSTANCE.getTry_statement_LParen();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRY_STATEMENT__PARAMETERS = eINSTANCE.getTry_statement_Parameters();

    /**
     * The meta object literal for the '<em><b>Rparent</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRY_STATEMENT__RPARENT = eINSTANCE.getTry_statement_Rparent();

    /**
     * The meta object literal for the '<em><b>Catch Statement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRY_STATEMENT__CATCH_STATEMENT = eINSTANCE.getTry_statement_CatchStatement();

    /**
     * The meta object literal for the '<em><b>Finally Statement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRY_STATEMENT__FINALLY_STATEMENT = eINSTANCE.getTry_statement_FinallyStatement();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Import_statementImpl <em>Import statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Import_statementImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getImport_statement()
     * @generated
     */
    EClass IMPORT_STATEMENT = eINSTANCE.getImport_statement();

    /**
     * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_STATEMENT__CLASS_NAME = eINSTANCE.getImport_statement_ClassName();

    /**
     * The meta object literal for the '<em><b>Pac Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_STATEMENT__PAC_NAME = eINSTANCE.getImport_statement_PacName();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.Package_statementImpl <em>Package statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.Package_statementImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getPackage_statement()
     * @generated
     */
    EClass PACKAGE_STATEMENT = eINSTANCE.getPackage_statement();

    /**
     * The meta object literal for the '<em><b>Pac Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PACKAGE_STATEMENT__PAC_NAME = eINSTANCE.getPackage_statement_PacName();

  }

} //MyDslPackage
