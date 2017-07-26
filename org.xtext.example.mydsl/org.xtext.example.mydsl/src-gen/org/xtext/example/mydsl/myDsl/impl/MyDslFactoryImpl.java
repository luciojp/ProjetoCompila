/**
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslFactoryImpl extends EFactoryImpl implements MyDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyDslFactory init()
  {
    try
    {
      MyDslFactory theMyDslFactory = (MyDslFactory)EPackage.Registry.INSTANCE.getEFactory(MyDslPackage.eNS_URI);
      if (theMyDslFactory != null)
      {
        return theMyDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MyDslPackage.MODEL: return createModel();
      case MyDslPackage.COMPILATION_UNIT: return createCompilation_unit();
      case MyDslPackage.TYPE_DECLARATION: return createType_declaration();
      case MyDslPackage.INTERFACE_DECLARATION: return createInterface_declaration();
      case MyDslPackage.CLASS_DECLARATION: return createClass_declaration();
      case MyDslPackage.FIELD_DECLARATION: return createField_declaration();
      case MyDslPackage.METHOD_DECLARATION: return createMethod_declaration();
      case MyDslPackage.CONSTRUCTOR_DECLARATION: return createConstructor_declaration();
      case MyDslPackage.PARAMETER_LIST: return createParameter_list();
      case MyDslPackage.PARAMETER: return createParameter();
      case MyDslPackage.VARIABLE_DECLARATION: return createVariable_declaration();
      case MyDslPackage.VARIABLE_DECLARATOR: return createVariable_declarator();
      case MyDslPackage.VARIABLE_INITIALIZER: return createVariable_initializer();
      case MyDslPackage.ARRAY_INITIALIZER: return createArray_initializer();
      case MyDslPackage.TYPE: return createType();
      case MyDslPackage.TYPE_SPECIFIER: return createType_specifier();
      case MyDslPackage.STATIC_INITIALIZER: return createStatic_initializer();
      case MyDslPackage.STATEMENT_BLOCK: return createStatement_block();
      case MyDslPackage.STATEMENT: return createStatement();
      case MyDslPackage.FOR_STATEMENT: return createFor_Statement();
      case MyDslPackage.EXPRESSION: return createExpression();
      case MyDslPackage.EXPRESSION_AUX: return createExpression_aux();
      case MyDslPackage.AMPERSAND_RULE: return createAmpersand_Rule();
      case MyDslPackage.FLOAT_LITERAL: return createFloat_Literal();
      case MyDslPackage.LITERAL_EXPRESSION: return createLiteral_Expression();
      case MyDslPackage.CREATING_EXPRESSION: return createCreating_Expression();
      case MyDslPackage.CAST_EXPRESSION: return createCast_Expression();
      case MyDslPackage.BIT_EXPRESSION_NR: return createBit_Expression_NR();
      case MyDslPackage.LOGICAL_EXPRESSION_NR: return createLogical_Expression_NR();
      case MyDslPackage.ARG_LIST: return createArg_List();
      case MyDslPackage.NUMERIC_EXPRESSION_NR: return createNumeric_Expression_NR();
      case MyDslPackage.SWITCH_STATEMENT: return createSwitch_statement();
      case MyDslPackage.WHILE_STATEMENT: return createWhile_Statement();
      case MyDslPackage.DO_STATEMENT: return createDo_Statement();
      case MyDslPackage.IF_STATEMENT: return createIf_statement();
      case MyDslPackage.TRY_STATEMENT: return createTry_statement();
      case MyDslPackage.IMPORT_STATEMENT: return createImport_statement();
      case MyDslPackage.PACKAGE_STATEMENT: return createPackage_statement();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Compilation_unit createCompilation_unit()
  {
    Compilation_unitImpl compilation_unit = new Compilation_unitImpl();
    return compilation_unit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type_declaration createType_declaration()
  {
    Type_declarationImpl type_declaration = new Type_declarationImpl();
    return type_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interface_declaration createInterface_declaration()
  {
    Interface_declarationImpl interface_declaration = new Interface_declarationImpl();
    return interface_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Class_declaration createClass_declaration()
  {
    Class_declarationImpl class_declaration = new Class_declarationImpl();
    return class_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field_declaration createField_declaration()
  {
    Field_declarationImpl field_declaration = new Field_declarationImpl();
    return field_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Method_declaration createMethod_declaration()
  {
    Method_declarationImpl method_declaration = new Method_declarationImpl();
    return method_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constructor_declaration createConstructor_declaration()
  {
    Constructor_declarationImpl constructor_declaration = new Constructor_declarationImpl();
    return constructor_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter_list createParameter_list()
  {
    Parameter_listImpl parameter_list = new Parameter_listImpl();
    return parameter_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable_declaration createVariable_declaration()
  {
    Variable_declarationImpl variable_declaration = new Variable_declarationImpl();
    return variable_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable_declarator createVariable_declarator()
  {
    Variable_declaratorImpl variable_declarator = new Variable_declaratorImpl();
    return variable_declarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable_initializer createVariable_initializer()
  {
    Variable_initializerImpl variable_initializer = new Variable_initializerImpl();
    return variable_initializer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Array_initializer createArray_initializer()
  {
    Array_initializerImpl array_initializer = new Array_initializerImpl();
    return array_initializer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type_specifier createType_specifier()
  {
    Type_specifierImpl type_specifier = new Type_specifierImpl();
    return type_specifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Static_initializer createStatic_initializer()
  {
    Static_initializerImpl static_initializer = new Static_initializerImpl();
    return static_initializer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement_block createStatement_block()
  {
    Statement_blockImpl statement_block = new Statement_blockImpl();
    return statement_block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public For_Statement createFor_Statement()
  {
    For_StatementImpl for_Statement = new For_StatementImpl();
    return for_Statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression_aux createExpression_aux()
  {
    Expression_auxImpl expression_aux = new Expression_auxImpl();
    return expression_aux;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ampersand_Rule createAmpersand_Rule()
  {
    Ampersand_RuleImpl ampersand_Rule = new Ampersand_RuleImpl();
    return ampersand_Rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Float_Literal createFloat_Literal()
  {
    Float_LiteralImpl float_Literal = new Float_LiteralImpl();
    return float_Literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal_Expression createLiteral_Expression()
  {
    Literal_ExpressionImpl literal_Expression = new Literal_ExpressionImpl();
    return literal_Expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Creating_Expression createCreating_Expression()
  {
    Creating_ExpressionImpl creating_Expression = new Creating_ExpressionImpl();
    return creating_Expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cast_Expression createCast_Expression()
  {
    Cast_ExpressionImpl cast_Expression = new Cast_ExpressionImpl();
    return cast_Expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bit_Expression_NR createBit_Expression_NR()
  {
    Bit_Expression_NRImpl bit_Expression_NR = new Bit_Expression_NRImpl();
    return bit_Expression_NR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Logical_Expression_NR createLogical_Expression_NR()
  {
    Logical_Expression_NRImpl logical_Expression_NR = new Logical_Expression_NRImpl();
    return logical_Expression_NR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Arg_List createArg_List()
  {
    Arg_ListImpl arg_List = new Arg_ListImpl();
    return arg_List;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Numeric_Expression_NR createNumeric_Expression_NR()
  {
    Numeric_Expression_NRImpl numeric_Expression_NR = new Numeric_Expression_NRImpl();
    return numeric_Expression_NR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Switch_statement createSwitch_statement()
  {
    Switch_statementImpl switch_statement = new Switch_statementImpl();
    return switch_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public While_Statement createWhile_Statement()
  {
    While_StatementImpl while_Statement = new While_StatementImpl();
    return while_Statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Do_Statement createDo_Statement()
  {
    Do_StatementImpl do_Statement = new Do_StatementImpl();
    return do_Statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public If_statement createIf_statement()
  {
    If_statementImpl if_statement = new If_statementImpl();
    return if_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Try_statement createTry_statement()
  {
    Try_statementImpl try_statement = new Try_statementImpl();
    return try_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import_statement createImport_statement()
  {
    Import_statementImpl import_statement = new Import_statementImpl();
    return import_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Package_statement createPackage_statement()
  {
    Package_statementImpl package_statement = new Package_statementImpl();
    return package_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslPackage getMyDslPackage()
  {
    return (MyDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyDslPackage getPackage()
  {
    return MyDslPackage.eINSTANCE;
  }

} //MyDslFactoryImpl
