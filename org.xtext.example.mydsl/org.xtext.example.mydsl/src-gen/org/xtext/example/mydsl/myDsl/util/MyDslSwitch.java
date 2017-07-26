/**
 */
package org.xtext.example.mydsl.myDsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.mydsl.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public class MyDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MyDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MyDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MyDslPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.COMPILATION_UNIT:
      {
        Compilation_unit compilation_unit = (Compilation_unit)theEObject;
        T result = caseCompilation_unit(compilation_unit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.TYPE_DECLARATION:
      {
        Type_declaration type_declaration = (Type_declaration)theEObject;
        T result = caseType_declaration(type_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.INTERFACE_DECLARATION:
      {
        Interface_declaration interface_declaration = (Interface_declaration)theEObject;
        T result = caseInterface_declaration(interface_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CLASS_DECLARATION:
      {
        Class_declaration class_declaration = (Class_declaration)theEObject;
        T result = caseClass_declaration(class_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FIELD_DECLARATION:
      {
        Field_declaration field_declaration = (Field_declaration)theEObject;
        T result = caseField_declaration(field_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.METHOD_DECLARATION:
      {
        Method_declaration method_declaration = (Method_declaration)theEObject;
        T result = caseMethod_declaration(method_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CONSTRUCTOR_DECLARATION:
      {
        Constructor_declaration constructor_declaration = (Constructor_declaration)theEObject;
        T result = caseConstructor_declaration(constructor_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PARAMETER_LIST:
      {
        Parameter_list parameter_list = (Parameter_list)theEObject;
        T result = caseParameter_list(parameter_list);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.VARIABLE_DECLARATION:
      {
        Variable_declaration variable_declaration = (Variable_declaration)theEObject;
        T result = caseVariable_declaration(variable_declaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.VARIABLE_DECLARATOR:
      {
        Variable_declarator variable_declarator = (Variable_declarator)theEObject;
        T result = caseVariable_declarator(variable_declarator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.VARIABLE_INITIALIZER:
      {
        Variable_initializer variable_initializer = (Variable_initializer)theEObject;
        T result = caseVariable_initializer(variable_initializer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ARRAY_INITIALIZER:
      {
        Array_initializer array_initializer = (Array_initializer)theEObject;
        T result = caseArray_initializer(array_initializer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.TYPE_SPECIFIER:
      {
        Type_specifier type_specifier = (Type_specifier)theEObject;
        T result = caseType_specifier(type_specifier);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.STATIC_INITIALIZER:
      {
        Static_initializer static_initializer = (Static_initializer)theEObject;
        T result = caseStatic_initializer(static_initializer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.STATEMENT_BLOCK:
      {
        Statement_block statement_block = (Statement_block)theEObject;
        T result = caseStatement_block(statement_block);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FOR_STATEMENT:
      {
        For_Statement for_Statement = (For_Statement)theEObject;
        T result = caseFor_Statement(for_Statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.EXPRESSION_AUX:
      {
        Expression_aux expression_aux = (Expression_aux)theEObject;
        T result = caseExpression_aux(expression_aux);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.AMPERSAND_RULE:
      {
        Ampersand_Rule ampersand_Rule = (Ampersand_Rule)theEObject;
        T result = caseAmpersand_Rule(ampersand_Rule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FLOAT_LITERAL:
      {
        Float_Literal float_Literal = (Float_Literal)theEObject;
        T result = caseFloat_Literal(float_Literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.LITERAL_EXPRESSION:
      {
        Literal_Expression literal_Expression = (Literal_Expression)theEObject;
        T result = caseLiteral_Expression(literal_Expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CREATING_EXPRESSION:
      {
        Creating_Expression creating_Expression = (Creating_Expression)theEObject;
        T result = caseCreating_Expression(creating_Expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CAST_EXPRESSION:
      {
        Cast_Expression cast_Expression = (Cast_Expression)theEObject;
        T result = caseCast_Expression(cast_Expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.BIT_EXPRESSION_NR:
      {
        Bit_Expression_NR bit_Expression_NR = (Bit_Expression_NR)theEObject;
        T result = caseBit_Expression_NR(bit_Expression_NR);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.LOGICAL_EXPRESSION_NR:
      {
        Logical_Expression_NR logical_Expression_NR = (Logical_Expression_NR)theEObject;
        T result = caseLogical_Expression_NR(logical_Expression_NR);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ARG_LIST:
      {
        Arg_List arg_List = (Arg_List)theEObject;
        T result = caseArg_List(arg_List);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.NUMERIC_EXPRESSION_NR:
      {
        Numeric_Expression_NR numeric_Expression_NR = (Numeric_Expression_NR)theEObject;
        T result = caseNumeric_Expression_NR(numeric_Expression_NR);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.SWITCH_STATEMENT:
      {
        Switch_statement switch_statement = (Switch_statement)theEObject;
        T result = caseSwitch_statement(switch_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.WHILE_STATEMENT:
      {
        While_Statement while_Statement = (While_Statement)theEObject;
        T result = caseWhile_Statement(while_Statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.DO_STATEMENT:
      {
        Do_Statement do_Statement = (Do_Statement)theEObject;
        T result = caseDo_Statement(do_Statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.IF_STATEMENT:
      {
        If_statement if_statement = (If_statement)theEObject;
        T result = caseIf_statement(if_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.TRY_STATEMENT:
      {
        Try_statement try_statement = (Try_statement)theEObject;
        T result = caseTry_statement(try_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.IMPORT_STATEMENT:
      {
        Import_statement import_statement = (Import_statement)theEObject;
        T result = caseImport_statement(import_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.PACKAGE_STATEMENT:
      {
        Package_statement package_statement = (Package_statement)theEObject;
        T result = casePackage_statement(package_statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Compilation unit</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Compilation unit</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompilation_unit(Compilation_unit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType_declaration(Type_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Interface declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Interface declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInterface_declaration(Interface_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClass_declaration(Class_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseField_declaration(Field_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethod_declaration(Method_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constructor declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constructor declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstructor_declaration(Constructor_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter list</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter list</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter_list(Parameter_list object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable_declaration(Variable_declaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable declarator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable declarator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable_declarator(Variable_declarator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable initializer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable initializer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable_initializer(Variable_initializer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array initializer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array initializer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArray_initializer(Array_initializer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type specifier</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type specifier</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType_specifier(Type_specifier object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Static initializer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Static initializer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatic_initializer(Static_initializer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement_block(Statement_block object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFor_Statement(For_Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression aux</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression aux</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression_aux(Expression_aux object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ampersand Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ampersand Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAmpersand_Rule(Ampersand_Rule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Float Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Float Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFloat_Literal(Float_Literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteral_Expression(Literal_Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Creating Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Creating Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCreating_Expression(Creating_Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cast Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cast Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCast_Expression(Cast_Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bit Expression NR</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bit Expression NR</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBit_Expression_NR(Bit_Expression_NR object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Logical Expression NR</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Logical Expression NR</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLogical_Expression_NR(Logical_Expression_NR object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Arg List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Arg List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArg_List(Arg_List object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Numeric Expression NR</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Numeric Expression NR</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNumeric_Expression_NR(Numeric_Expression_NR object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Switch statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Switch statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSwitch_statement(Switch_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>While Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>While Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWhile_Statement(While_Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Do Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Do Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDo_Statement(Do_Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIf_statement(If_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Try statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Try statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTry_statement(Try_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport_statement(Import_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Package statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Package statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePackage_statement(Package_statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MyDslSwitch
