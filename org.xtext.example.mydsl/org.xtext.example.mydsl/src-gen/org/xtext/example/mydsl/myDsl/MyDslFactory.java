/**
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public interface MyDslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslFactory eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Compilation unit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Compilation unit</em>'.
   * @generated
   */
  Compilation_unit createCompilation_unit();

  /**
   * Returns a new object of class '<em>Type declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type declaration</em>'.
   * @generated
   */
  Type_declaration createType_declaration();

  /**
   * Returns a new object of class '<em>Interface declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface declaration</em>'.
   * @generated
   */
  Interface_declaration createInterface_declaration();

  /**
   * Returns a new object of class '<em>Class declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Class declaration</em>'.
   * @generated
   */
  Class_declaration createClass_declaration();

  /**
   * Returns a new object of class '<em>Field declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field declaration</em>'.
   * @generated
   */
  Field_declaration createField_declaration();

  /**
   * Returns a new object of class '<em>Method declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method declaration</em>'.
   * @generated
   */
  Method_declaration createMethod_declaration();

  /**
   * Returns a new object of class '<em>Constructor declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constructor declaration</em>'.
   * @generated
   */
  Constructor_declaration createConstructor_declaration();

  /**
   * Returns a new object of class '<em>Parameter list</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter list</em>'.
   * @generated
   */
  Parameter_list createParameter_list();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

  /**
   * Returns a new object of class '<em>Variable declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable declaration</em>'.
   * @generated
   */
  Variable_declaration createVariable_declaration();

  /**
   * Returns a new object of class '<em>Variable declarator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable declarator</em>'.
   * @generated
   */
  Variable_declarator createVariable_declarator();

  /**
   * Returns a new object of class '<em>Variable initializer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable initializer</em>'.
   * @generated
   */
  Variable_initializer createVariable_initializer();

  /**
   * Returns a new object of class '<em>Array initializer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Array initializer</em>'.
   * @generated
   */
  Array_initializer createArray_initializer();

  /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
  Type createType();

  /**
   * Returns a new object of class '<em>Type specifier</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type specifier</em>'.
   * @generated
   */
  Type_specifier createType_specifier();

  /**
   * Returns a new object of class '<em>Static initializer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Static initializer</em>'.
   * @generated
   */
  Static_initializer createStatic_initializer();

  /**
   * Returns a new object of class '<em>Statement block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement block</em>'.
   * @generated
   */
  Statement_block createStatement_block();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>For Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>For Statement</em>'.
   * @generated
   */
  For_Statement createFor_Statement();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Expression aux</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression aux</em>'.
   * @generated
   */
  Expression_aux createExpression_aux();

  /**
   * Returns a new object of class '<em>Ampersand Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ampersand Rule</em>'.
   * @generated
   */
  Ampersand_Rule createAmpersand_Rule();

  /**
   * Returns a new object of class '<em>Float Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Float Literal</em>'.
   * @generated
   */
  Float_Literal createFloat_Literal();

  /**
   * Returns a new object of class '<em>Literal Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal Expression</em>'.
   * @generated
   */
  Literal_Expression createLiteral_Expression();

  /**
   * Returns a new object of class '<em>Creating Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Creating Expression</em>'.
   * @generated
   */
  Creating_Expression createCreating_Expression();

  /**
   * Returns a new object of class '<em>Cast Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cast Expression</em>'.
   * @generated
   */
  Cast_Expression createCast_Expression();

  /**
   * Returns a new object of class '<em>Bit Expression NR</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bit Expression NR</em>'.
   * @generated
   */
  Bit_Expression_NR createBit_Expression_NR();

  /**
   * Returns a new object of class '<em>Logical Expression NR</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Logical Expression NR</em>'.
   * @generated
   */
  Logical_Expression_NR createLogical_Expression_NR();

  /**
   * Returns a new object of class '<em>Arg List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Arg List</em>'.
   * @generated
   */
  Arg_List createArg_List();

  /**
   * Returns a new object of class '<em>Numeric Expression NR</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Numeric Expression NR</em>'.
   * @generated
   */
  Numeric_Expression_NR createNumeric_Expression_NR();

  /**
   * Returns a new object of class '<em>Switch statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Switch statement</em>'.
   * @generated
   */
  Switch_statement createSwitch_statement();

  /**
   * Returns a new object of class '<em>While Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>While Statement</em>'.
   * @generated
   */
  While_Statement createWhile_Statement();

  /**
   * Returns a new object of class '<em>Do Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Do Statement</em>'.
   * @generated
   */
  Do_Statement createDo_Statement();

  /**
   * Returns a new object of class '<em>If statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>If statement</em>'.
   * @generated
   */
  If_statement createIf_statement();

  /**
   * Returns a new object of class '<em>Try statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Try statement</em>'.
   * @generated
   */
  Try_statement createTry_statement();

  /**
   * Returns a new object of class '<em>Import statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import statement</em>'.
   * @generated
   */
  Import_statement createImport_statement();

  /**
   * Returns a new object of class '<em>Package statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Package statement</em>'.
   * @generated
   */
  Package_statement createPackage_statement();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MyDslPackage getMyDslPackage();

} //MyDslFactory
