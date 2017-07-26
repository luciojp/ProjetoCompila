/**
 */
package org.xtext.example.mydsl.myDsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.example.mydsl.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public class MyDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MyDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MyDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MyDslSwitch<Adapter> modelSwitch =
    new MyDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseCompilation_unit(Compilation_unit object)
      {
        return createCompilation_unitAdapter();
      }
      @Override
      public Adapter caseType_declaration(Type_declaration object)
      {
        return createType_declarationAdapter();
      }
      @Override
      public Adapter caseInterface_declaration(Interface_declaration object)
      {
        return createInterface_declarationAdapter();
      }
      @Override
      public Adapter caseClass_declaration(Class_declaration object)
      {
        return createClass_declarationAdapter();
      }
      @Override
      public Adapter caseField_declaration(Field_declaration object)
      {
        return createField_declarationAdapter();
      }
      @Override
      public Adapter caseMethod_declaration(Method_declaration object)
      {
        return createMethod_declarationAdapter();
      }
      @Override
      public Adapter caseConstructor_declaration(Constructor_declaration object)
      {
        return createConstructor_declarationAdapter();
      }
      @Override
      public Adapter caseParameter_list(Parameter_list object)
      {
        return createParameter_listAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseVariable_declaration(Variable_declaration object)
      {
        return createVariable_declarationAdapter();
      }
      @Override
      public Adapter caseVariable_declarator(Variable_declarator object)
      {
        return createVariable_declaratorAdapter();
      }
      @Override
      public Adapter caseVariable_initializer(Variable_initializer object)
      {
        return createVariable_initializerAdapter();
      }
      @Override
      public Adapter caseArray_initializer(Array_initializer object)
      {
        return createArray_initializerAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseType_specifier(Type_specifier object)
      {
        return createType_specifierAdapter();
      }
      @Override
      public Adapter caseStatic_initializer(Static_initializer object)
      {
        return createStatic_initializerAdapter();
      }
      @Override
      public Adapter caseStatement_block(Statement_block object)
      {
        return createStatement_blockAdapter();
      }
      @Override
      public Adapter caseStatement(Statement object)
      {
        return createStatementAdapter();
      }
      @Override
      public Adapter caseFor_Statement(For_Statement object)
      {
        return createFor_StatementAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseExpression_aux(Expression_aux object)
      {
        return createExpression_auxAdapter();
      }
      @Override
      public Adapter caseAmpersand_Rule(Ampersand_Rule object)
      {
        return createAmpersand_RuleAdapter();
      }
      @Override
      public Adapter caseFloat_Literal(Float_Literal object)
      {
        return createFloat_LiteralAdapter();
      }
      @Override
      public Adapter caseLiteral_Expression(Literal_Expression object)
      {
        return createLiteral_ExpressionAdapter();
      }
      @Override
      public Adapter caseCreating_Expression(Creating_Expression object)
      {
        return createCreating_ExpressionAdapter();
      }
      @Override
      public Adapter caseCast_Expression(Cast_Expression object)
      {
        return createCast_ExpressionAdapter();
      }
      @Override
      public Adapter caseBit_Expression_NR(Bit_Expression_NR object)
      {
        return createBit_Expression_NRAdapter();
      }
      @Override
      public Adapter caseLogical_Expression_NR(Logical_Expression_NR object)
      {
        return createLogical_Expression_NRAdapter();
      }
      @Override
      public Adapter caseArg_List(Arg_List object)
      {
        return createArg_ListAdapter();
      }
      @Override
      public Adapter caseNumeric_Expression_NR(Numeric_Expression_NR object)
      {
        return createNumeric_Expression_NRAdapter();
      }
      @Override
      public Adapter caseSwitch_statement(Switch_statement object)
      {
        return createSwitch_statementAdapter();
      }
      @Override
      public Adapter caseWhile_Statement(While_Statement object)
      {
        return createWhile_StatementAdapter();
      }
      @Override
      public Adapter caseDo_Statement(Do_Statement object)
      {
        return createDo_StatementAdapter();
      }
      @Override
      public Adapter caseIf_statement(If_statement object)
      {
        return createIf_statementAdapter();
      }
      @Override
      public Adapter caseTry_statement(Try_statement object)
      {
        return createTry_statementAdapter();
      }
      @Override
      public Adapter caseImport_statement(Import_statement object)
      {
        return createImport_statementAdapter();
      }
      @Override
      public Adapter casePackage_statement(Package_statement object)
      {
        return createPackage_statementAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.Compilation_unit <em>Compilation unit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.Compilation_unit
   * @generated
   */
  public Adapter createCompilation_unitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.Type_declaration <em>Type declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.Type_declaration
   * @generated
   */
  public Adapter createType_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.Interface_declaration <em>Interface declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.Interface_declaration
   * @generated
   */
  public Adapter createInterface_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.Class_declaration <em>Class declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.Class_declaration
   * @generated
   */
  public Adapter createClass_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.Field_declaration <em>Field declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.Field_declaration
   * @generated
   */
  public Adapter createField_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.Method_declaration <em>Method declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.Method_declaration
   * @generated
   */
  public Adapter createMethod_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.Constructor_declaration <em>Constructor declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.Constructor_declaration
   * @generated
   */
  public Adapter createConstructor_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.Parameter_list <em>Parameter list</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.Parameter_list
   * @generated
   */
  public Adapter createParameter_listAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.Variable_declaration <em>Variable declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.Variable_declaration
   * @generated
   */
  public Adapter createVariable_declarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.Variable_declarator <em>Variable declarator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.Variable_declarator
   * @generated
   */
  public Adapter createVariable_declaratorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.Variable_initializer <em>Variable initializer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.Variable_initializer
   * @generated
   */
  public Adapter createVariable_initializerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.Array_initializer <em>Array initializer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.Array_initializer
   * @generated
   */
  public Adapter createArray_initializerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.Type_specifier <em>Type specifier</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.Type_specifier
   * @generated
   */
  public Adapter createType_specifierAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.Static_initializer <em>Static initializer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.Static_initializer
   * @generated
   */
  public Adapter createStatic_initializerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.Statement_block <em>Statement block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.Statement_block
   * @generated
   */
  public Adapter createStatement_blockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.Statement
   * @generated
   */
  public Adapter createStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.For_Statement <em>For Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.For_Statement
   * @generated
   */
  public Adapter createFor_StatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.Expression_aux <em>Expression aux</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.Expression_aux
   * @generated
   */
  public Adapter createExpression_auxAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.Ampersand_Rule <em>Ampersand Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.Ampersand_Rule
   * @generated
   */
  public Adapter createAmpersand_RuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.Float_Literal <em>Float Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.Float_Literal
   * @generated
   */
  public Adapter createFloat_LiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.Literal_Expression <em>Literal Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.Literal_Expression
   * @generated
   */
  public Adapter createLiteral_ExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.Creating_Expression <em>Creating Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.Creating_Expression
   * @generated
   */
  public Adapter createCreating_ExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.Cast_Expression <em>Cast Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.Cast_Expression
   * @generated
   */
  public Adapter createCast_ExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.Bit_Expression_NR <em>Bit Expression NR</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.Bit_Expression_NR
   * @generated
   */
  public Adapter createBit_Expression_NRAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.Logical_Expression_NR <em>Logical Expression NR</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.Logical_Expression_NR
   * @generated
   */
  public Adapter createLogical_Expression_NRAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.Arg_List <em>Arg List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.Arg_List
   * @generated
   */
  public Adapter createArg_ListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.Numeric_Expression_NR <em>Numeric Expression NR</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.Numeric_Expression_NR
   * @generated
   */
  public Adapter createNumeric_Expression_NRAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.Switch_statement <em>Switch statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.Switch_statement
   * @generated
   */
  public Adapter createSwitch_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.While_Statement <em>While Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.While_Statement
   * @generated
   */
  public Adapter createWhile_StatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.Do_Statement <em>Do Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.Do_Statement
   * @generated
   */
  public Adapter createDo_StatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.If_statement <em>If statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.If_statement
   * @generated
   */
  public Adapter createIf_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.Try_statement <em>Try statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.Try_statement
   * @generated
   */
  public Adapter createTry_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.Import_statement <em>Import statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.Import_statement
   * @generated
   */
  public Adapter createImport_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.myDsl.Package_statement <em>Package statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.myDsl.Package_statement
   * @generated
   */
  public Adapter createPackage_statementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //MyDslAdapterFactory
