/**
 */
package com.b2international.snowowl.snomed.ecl.ecl;

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
 * @see com.b2international.snowowl.snomed.ecl.ecl.EclFactory
 * @model kind="package"
 * @generated
 */
public interface EclPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "ecl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.b2international.com/snowowl/snomed/Ecl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "ecl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EclPackage eINSTANCE = com.b2international.snowowl.snomed.ecl.ecl.impl.EclPackageImpl.init();

  /**
   * The meta object id for the '{@link com.b2international.snowowl.snomed.ecl.ecl.impl.ExpressionConstraintImpl <em>Expression Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snowowl.snomed.ecl.ecl.impl.ExpressionConstraintImpl
   * @see com.b2international.snowowl.snomed.ecl.ecl.impl.EclPackageImpl#getExpressionConstraint()
   * @generated
   */
  int EXPRESSION_CONSTRAINT = 0;

  /**
   * The number of structural features of the '<em>Expression Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_CONSTRAINT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.b2international.snowowl.snomed.ecl.ecl.impl.RefinedExpressionConstraintImpl <em>Refined Expression Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snowowl.snomed.ecl.ecl.impl.RefinedExpressionConstraintImpl
   * @see com.b2international.snowowl.snomed.ecl.ecl.impl.EclPackageImpl#getRefinedExpressionConstraint()
   * @generated
   */
  int REFINED_EXPRESSION_CONSTRAINT = 1;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFINED_EXPRESSION_CONSTRAINT__CONSTRAINT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Refinement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFINED_EXPRESSION_CONSTRAINT__REFINEMENT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Refined Expression Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFINED_EXPRESSION_CONSTRAINT_FEATURE_COUNT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.b2international.snowowl.snomed.ecl.ecl.impl.ChildOfImpl <em>Child Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snowowl.snomed.ecl.ecl.impl.ChildOfImpl
   * @see com.b2international.snowowl.snomed.ecl.ecl.impl.EclPackageImpl#getChildOf()
   * @generated
   */
  int CHILD_OF = 2;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHILD_OF__CONSTRAINT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Child Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHILD_OF_FEATURE_COUNT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.b2international.snowowl.snomed.ecl.ecl.impl.DescendantOfImpl <em>Descendant Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snowowl.snomed.ecl.ecl.impl.DescendantOfImpl
   * @see com.b2international.snowowl.snomed.ecl.ecl.impl.EclPackageImpl#getDescendantOf()
   * @generated
   */
  int DESCENDANT_OF = 3;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCENDANT_OF__CONSTRAINT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Descendant Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCENDANT_OF_FEATURE_COUNT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.b2international.snowowl.snomed.ecl.ecl.impl.DescendantOrSelfOfImpl <em>Descendant Or Self Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snowowl.snomed.ecl.ecl.impl.DescendantOrSelfOfImpl
   * @see com.b2international.snowowl.snomed.ecl.ecl.impl.EclPackageImpl#getDescendantOrSelfOf()
   * @generated
   */
  int DESCENDANT_OR_SELF_OF = 4;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCENDANT_OR_SELF_OF__CONSTRAINT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Descendant Or Self Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCENDANT_OR_SELF_OF_FEATURE_COUNT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.b2international.snowowl.snomed.ecl.ecl.impl.ParentOfImpl <em>Parent Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snowowl.snomed.ecl.ecl.impl.ParentOfImpl
   * @see com.b2international.snowowl.snomed.ecl.ecl.impl.EclPackageImpl#getParentOf()
   * @generated
   */
  int PARENT_OF = 5;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENT_OF__CONSTRAINT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parent Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENT_OF_FEATURE_COUNT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.b2international.snowowl.snomed.ecl.ecl.impl.AncestorOfImpl <em>Ancestor Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snowowl.snomed.ecl.ecl.impl.AncestorOfImpl
   * @see com.b2international.snowowl.snomed.ecl.ecl.impl.EclPackageImpl#getAncestorOf()
   * @generated
   */
  int ANCESTOR_OF = 6;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCESTOR_OF__CONSTRAINT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ancestor Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCESTOR_OF_FEATURE_COUNT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.b2international.snowowl.snomed.ecl.ecl.impl.AncestorOrSelfOfImpl <em>Ancestor Or Self Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snowowl.snomed.ecl.ecl.impl.AncestorOrSelfOfImpl
   * @see com.b2international.snowowl.snomed.ecl.ecl.impl.EclPackageImpl#getAncestorOrSelfOf()
   * @generated
   */
  int ANCESTOR_OR_SELF_OF = 7;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCESTOR_OR_SELF_OF__CONSTRAINT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ancestor Or Self Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCESTOR_OR_SELF_OF_FEATURE_COUNT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.b2international.snowowl.snomed.ecl.ecl.impl.MemberOfImpl <em>Member Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snowowl.snomed.ecl.ecl.impl.MemberOfImpl
   * @see com.b2international.snowowl.snomed.ecl.ecl.impl.EclPackageImpl#getMemberOf()
   * @generated
   */
  int MEMBER_OF = 8;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_OF__CONSTRAINT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Member Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_OF_FEATURE_COUNT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.b2international.snowowl.snomed.ecl.ecl.impl.ConceptReferenceImpl <em>Concept Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snowowl.snomed.ecl.ecl.impl.ConceptReferenceImpl
   * @see com.b2international.snowowl.snomed.ecl.ecl.impl.EclPackageImpl#getConceptReference()
   * @generated
   */
  int CONCEPT_REFERENCE = 9;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPT_REFERENCE__ID = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Term</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPT_REFERENCE__TERM = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Concept Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPT_REFERENCE_FEATURE_COUNT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.b2international.snowowl.snomed.ecl.ecl.impl.AnyImpl <em>Any</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snowowl.snomed.ecl.ecl.impl.AnyImpl
   * @see com.b2international.snowowl.snomed.ecl.ecl.impl.EclPackageImpl#getAny()
   * @generated
   */
  int ANY = 10;

  /**
   * The number of structural features of the '<em>Any</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_FEATURE_COUNT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.b2international.snowowl.snomed.ecl.ecl.impl.RefinementImpl <em>Refinement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snowowl.snomed.ecl.ecl.impl.RefinementImpl
   * @see com.b2international.snowowl.snomed.ecl.ecl.impl.EclPackageImpl#getRefinement()
   * @generated
   */
  int REFINEMENT = 11;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFINEMENT__ATTRIBUTE = 0;

  /**
   * The feature id for the '<em><b>Comparison</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFINEMENT__COMPARISON = 1;

  /**
   * The number of structural features of the '<em>Refinement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFINEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.b2international.snowowl.snomed.ecl.ecl.impl.ComparisonImpl <em>Comparison</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snowowl.snomed.ecl.ecl.impl.ComparisonImpl
   * @see com.b2international.snowowl.snomed.ecl.ecl.impl.EclPackageImpl#getComparison()
   * @generated
   */
  int COMPARISON = 12;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__CONSTRAINT = 0;

  /**
   * The number of structural features of the '<em>Comparison</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.b2international.snowowl.snomed.ecl.ecl.impl.AttributeValueEqualsImpl <em>Attribute Value Equals</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snowowl.snomed.ecl.ecl.impl.AttributeValueEqualsImpl
   * @see com.b2international.snowowl.snomed.ecl.ecl.impl.EclPackageImpl#getAttributeValueEquals()
   * @generated
   */
  int ATTRIBUTE_VALUE_EQUALS = 13;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_VALUE_EQUALS__CONSTRAINT = COMPARISON__CONSTRAINT;

  /**
   * The number of structural features of the '<em>Attribute Value Equals</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_VALUE_EQUALS_FEATURE_COUNT = COMPARISON_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.b2international.snowowl.snomed.ecl.ecl.impl.AttributeValueNotEqualsImpl <em>Attribute Value Not Equals</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snowowl.snomed.ecl.ecl.impl.AttributeValueNotEqualsImpl
   * @see com.b2international.snowowl.snomed.ecl.ecl.impl.EclPackageImpl#getAttributeValueNotEquals()
   * @generated
   */
  int ATTRIBUTE_VALUE_NOT_EQUALS = 14;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_VALUE_NOT_EQUALS__CONSTRAINT = COMPARISON__CONSTRAINT;

  /**
   * The number of structural features of the '<em>Attribute Value Not Equals</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_VALUE_NOT_EQUALS_FEATURE_COUNT = COMPARISON_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.b2international.snowowl.snomed.ecl.ecl.impl.NestedExpressionImpl <em>Nested Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snowowl.snomed.ecl.ecl.impl.NestedExpressionImpl
   * @see com.b2international.snowowl.snomed.ecl.ecl.impl.EclPackageImpl#getNestedExpression()
   * @generated
   */
  int NESTED_EXPRESSION = 15;

  /**
   * The feature id for the '<em><b>Nested</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_EXPRESSION__NESTED = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Nested Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_EXPRESSION_FEATURE_COUNT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.b2international.snowowl.snomed.ecl.ecl.impl.OrExpressionConstraintImpl <em>Or Expression Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snowowl.snomed.ecl.ecl.impl.OrExpressionConstraintImpl
   * @see com.b2international.snowowl.snomed.ecl.ecl.impl.EclPackageImpl#getOrExpressionConstraint()
   * @generated
   */
  int OR_EXPRESSION_CONSTRAINT = 16;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION_CONSTRAINT__LEFT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION_CONSTRAINT__RIGHT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Or Expression Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION_CONSTRAINT_FEATURE_COUNT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.b2international.snowowl.snomed.ecl.ecl.impl.AndExpressionConstraintImpl <em>And Expression Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snowowl.snomed.ecl.ecl.impl.AndExpressionConstraintImpl
   * @see com.b2international.snowowl.snomed.ecl.ecl.impl.EclPackageImpl#getAndExpressionConstraint()
   * @generated
   */
  int AND_EXPRESSION_CONSTRAINT = 17;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION_CONSTRAINT__LEFT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION_CONSTRAINT__RIGHT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>And Expression Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION_CONSTRAINT_FEATURE_COUNT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.b2international.snowowl.snomed.ecl.ecl.impl.ExclusionExpressionConstraintImpl <em>Exclusion Expression Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snowowl.snomed.ecl.ecl.impl.ExclusionExpressionConstraintImpl
   * @see com.b2international.snowowl.snomed.ecl.ecl.impl.EclPackageImpl#getExclusionExpressionConstraint()
   * @generated
   */
  int EXCLUSION_EXPRESSION_CONSTRAINT = 18;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCLUSION_EXPRESSION_CONSTRAINT__LEFT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCLUSION_EXPRESSION_CONSTRAINT__RIGHT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Exclusion Expression Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCLUSION_EXPRESSION_CONSTRAINT_FEATURE_COUNT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link com.b2international.snowowl.snomed.ecl.ecl.ExpressionConstraint <em>Expression Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Constraint</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.ExpressionConstraint
   * @generated
   */
  EClass getExpressionConstraint();

  /**
   * Returns the meta object for class '{@link com.b2international.snowowl.snomed.ecl.ecl.RefinedExpressionConstraint <em>Refined Expression Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Refined Expression Constraint</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.RefinedExpressionConstraint
   * @generated
   */
  EClass getRefinedExpressionConstraint();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snowowl.snomed.ecl.ecl.RefinedExpressionConstraint#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.RefinedExpressionConstraint#getConstraint()
   * @see #getRefinedExpressionConstraint()
   * @generated
   */
  EReference getRefinedExpressionConstraint_Constraint();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snowowl.snomed.ecl.ecl.RefinedExpressionConstraint#getRefinement <em>Refinement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Refinement</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.RefinedExpressionConstraint#getRefinement()
   * @see #getRefinedExpressionConstraint()
   * @generated
   */
  EReference getRefinedExpressionConstraint_Refinement();

  /**
   * Returns the meta object for class '{@link com.b2international.snowowl.snomed.ecl.ecl.ChildOf <em>Child Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Child Of</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.ChildOf
   * @generated
   */
  EClass getChildOf();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snowowl.snomed.ecl.ecl.ChildOf#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.ChildOf#getConstraint()
   * @see #getChildOf()
   * @generated
   */
  EReference getChildOf_Constraint();

  /**
   * Returns the meta object for class '{@link com.b2international.snowowl.snomed.ecl.ecl.DescendantOf <em>Descendant Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Descendant Of</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.DescendantOf
   * @generated
   */
  EClass getDescendantOf();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snowowl.snomed.ecl.ecl.DescendantOf#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.DescendantOf#getConstraint()
   * @see #getDescendantOf()
   * @generated
   */
  EReference getDescendantOf_Constraint();

  /**
   * Returns the meta object for class '{@link com.b2international.snowowl.snomed.ecl.ecl.DescendantOrSelfOf <em>Descendant Or Self Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Descendant Or Self Of</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.DescendantOrSelfOf
   * @generated
   */
  EClass getDescendantOrSelfOf();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snowowl.snomed.ecl.ecl.DescendantOrSelfOf#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.DescendantOrSelfOf#getConstraint()
   * @see #getDescendantOrSelfOf()
   * @generated
   */
  EReference getDescendantOrSelfOf_Constraint();

  /**
   * Returns the meta object for class '{@link com.b2international.snowowl.snomed.ecl.ecl.ParentOf <em>Parent Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parent Of</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.ParentOf
   * @generated
   */
  EClass getParentOf();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snowowl.snomed.ecl.ecl.ParentOf#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.ParentOf#getConstraint()
   * @see #getParentOf()
   * @generated
   */
  EReference getParentOf_Constraint();

  /**
   * Returns the meta object for class '{@link com.b2international.snowowl.snomed.ecl.ecl.AncestorOf <em>Ancestor Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ancestor Of</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.AncestorOf
   * @generated
   */
  EClass getAncestorOf();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snowowl.snomed.ecl.ecl.AncestorOf#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.AncestorOf#getConstraint()
   * @see #getAncestorOf()
   * @generated
   */
  EReference getAncestorOf_Constraint();

  /**
   * Returns the meta object for class '{@link com.b2international.snowowl.snomed.ecl.ecl.AncestorOrSelfOf <em>Ancestor Or Self Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ancestor Or Self Of</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.AncestorOrSelfOf
   * @generated
   */
  EClass getAncestorOrSelfOf();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snowowl.snomed.ecl.ecl.AncestorOrSelfOf#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.AncestorOrSelfOf#getConstraint()
   * @see #getAncestorOrSelfOf()
   * @generated
   */
  EReference getAncestorOrSelfOf_Constraint();

  /**
   * Returns the meta object for class '{@link com.b2international.snowowl.snomed.ecl.ecl.MemberOf <em>Member Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Member Of</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.MemberOf
   * @generated
   */
  EClass getMemberOf();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snowowl.snomed.ecl.ecl.MemberOf#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.MemberOf#getConstraint()
   * @see #getMemberOf()
   * @generated
   */
  EReference getMemberOf_Constraint();

  /**
   * Returns the meta object for class '{@link com.b2international.snowowl.snomed.ecl.ecl.ConceptReference <em>Concept Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concept Reference</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.ConceptReference
   * @generated
   */
  EClass getConceptReference();

  /**
   * Returns the meta object for the attribute '{@link com.b2international.snowowl.snomed.ecl.ecl.ConceptReference#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.ConceptReference#getId()
   * @see #getConceptReference()
   * @generated
   */
  EAttribute getConceptReference_Id();

  /**
   * Returns the meta object for the attribute '{@link com.b2international.snowowl.snomed.ecl.ecl.ConceptReference#getTerm <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Term</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.ConceptReference#getTerm()
   * @see #getConceptReference()
   * @generated
   */
  EAttribute getConceptReference_Term();

  /**
   * Returns the meta object for class '{@link com.b2international.snowowl.snomed.ecl.ecl.Any <em>Any</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Any</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.Any
   * @generated
   */
  EClass getAny();

  /**
   * Returns the meta object for class '{@link com.b2international.snowowl.snomed.ecl.ecl.Refinement <em>Refinement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Refinement</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.Refinement
   * @generated
   */
  EClass getRefinement();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snowowl.snomed.ecl.ecl.Refinement#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attribute</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.Refinement#getAttribute()
   * @see #getRefinement()
   * @generated
   */
  EReference getRefinement_Attribute();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snowowl.snomed.ecl.ecl.Refinement#getComparison <em>Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Comparison</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.Refinement#getComparison()
   * @see #getRefinement()
   * @generated
   */
  EReference getRefinement_Comparison();

  /**
   * Returns the meta object for class '{@link com.b2international.snowowl.snomed.ecl.ecl.Comparison <em>Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comparison</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.Comparison
   * @generated
   */
  EClass getComparison();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snowowl.snomed.ecl.ecl.Comparison#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.Comparison#getConstraint()
   * @see #getComparison()
   * @generated
   */
  EReference getComparison_Constraint();

  /**
   * Returns the meta object for class '{@link com.b2international.snowowl.snomed.ecl.ecl.AttributeValueEquals <em>Attribute Value Equals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Value Equals</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.AttributeValueEquals
   * @generated
   */
  EClass getAttributeValueEquals();

  /**
   * Returns the meta object for class '{@link com.b2international.snowowl.snomed.ecl.ecl.AttributeValueNotEquals <em>Attribute Value Not Equals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Value Not Equals</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.AttributeValueNotEquals
   * @generated
   */
  EClass getAttributeValueNotEquals();

  /**
   * Returns the meta object for class '{@link com.b2international.snowowl.snomed.ecl.ecl.NestedExpression <em>Nested Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nested Expression</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.NestedExpression
   * @generated
   */
  EClass getNestedExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snowowl.snomed.ecl.ecl.NestedExpression#getNested <em>Nested</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nested</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.NestedExpression#getNested()
   * @see #getNestedExpression()
   * @generated
   */
  EReference getNestedExpression_Nested();

  /**
   * Returns the meta object for class '{@link com.b2international.snowowl.snomed.ecl.ecl.OrExpressionConstraint <em>Or Expression Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Expression Constraint</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.OrExpressionConstraint
   * @generated
   */
  EClass getOrExpressionConstraint();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snowowl.snomed.ecl.ecl.OrExpressionConstraint#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.OrExpressionConstraint#getLeft()
   * @see #getOrExpressionConstraint()
   * @generated
   */
  EReference getOrExpressionConstraint_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snowowl.snomed.ecl.ecl.OrExpressionConstraint#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.OrExpressionConstraint#getRight()
   * @see #getOrExpressionConstraint()
   * @generated
   */
  EReference getOrExpressionConstraint_Right();

  /**
   * Returns the meta object for class '{@link com.b2international.snowowl.snomed.ecl.ecl.AndExpressionConstraint <em>And Expression Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Expression Constraint</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.AndExpressionConstraint
   * @generated
   */
  EClass getAndExpressionConstraint();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snowowl.snomed.ecl.ecl.AndExpressionConstraint#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.AndExpressionConstraint#getLeft()
   * @see #getAndExpressionConstraint()
   * @generated
   */
  EReference getAndExpressionConstraint_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snowowl.snomed.ecl.ecl.AndExpressionConstraint#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.AndExpressionConstraint#getRight()
   * @see #getAndExpressionConstraint()
   * @generated
   */
  EReference getAndExpressionConstraint_Right();

  /**
   * Returns the meta object for class '{@link com.b2international.snowowl.snomed.ecl.ecl.ExclusionExpressionConstraint <em>Exclusion Expression Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exclusion Expression Constraint</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.ExclusionExpressionConstraint
   * @generated
   */
  EClass getExclusionExpressionConstraint();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snowowl.snomed.ecl.ecl.ExclusionExpressionConstraint#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.ExclusionExpressionConstraint#getLeft()
   * @see #getExclusionExpressionConstraint()
   * @generated
   */
  EReference getExclusionExpressionConstraint_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snowowl.snomed.ecl.ecl.ExclusionExpressionConstraint#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.b2international.snowowl.snomed.ecl.ecl.ExclusionExpressionConstraint#getRight()
   * @see #getExclusionExpressionConstraint()
   * @generated
   */
  EReference getExclusionExpressionConstraint_Right();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EclFactory getEclFactory();

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
     * The meta object literal for the '{@link com.b2international.snowowl.snomed.ecl.ecl.impl.ExpressionConstraintImpl <em>Expression Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snowowl.snomed.ecl.ecl.impl.ExpressionConstraintImpl
     * @see com.b2international.snowowl.snomed.ecl.ecl.impl.EclPackageImpl#getExpressionConstraint()
     * @generated
     */
    EClass EXPRESSION_CONSTRAINT = eINSTANCE.getExpressionConstraint();

    /**
     * The meta object literal for the '{@link com.b2international.snowowl.snomed.ecl.ecl.impl.RefinedExpressionConstraintImpl <em>Refined Expression Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snowowl.snomed.ecl.ecl.impl.RefinedExpressionConstraintImpl
     * @see com.b2international.snowowl.snomed.ecl.ecl.impl.EclPackageImpl#getRefinedExpressionConstraint()
     * @generated
     */
    EClass REFINED_EXPRESSION_CONSTRAINT = eINSTANCE.getRefinedExpressionConstraint();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFINED_EXPRESSION_CONSTRAINT__CONSTRAINT = eINSTANCE.getRefinedExpressionConstraint_Constraint();

    /**
     * The meta object literal for the '<em><b>Refinement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFINED_EXPRESSION_CONSTRAINT__REFINEMENT = eINSTANCE.getRefinedExpressionConstraint_Refinement();

    /**
     * The meta object literal for the '{@link com.b2international.snowowl.snomed.ecl.ecl.impl.ChildOfImpl <em>Child Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snowowl.snomed.ecl.ecl.impl.ChildOfImpl
     * @see com.b2international.snowowl.snomed.ecl.ecl.impl.EclPackageImpl#getChildOf()
     * @generated
     */
    EClass CHILD_OF = eINSTANCE.getChildOf();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHILD_OF__CONSTRAINT = eINSTANCE.getChildOf_Constraint();

    /**
     * The meta object literal for the '{@link com.b2international.snowowl.snomed.ecl.ecl.impl.DescendantOfImpl <em>Descendant Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snowowl.snomed.ecl.ecl.impl.DescendantOfImpl
     * @see com.b2international.snowowl.snomed.ecl.ecl.impl.EclPackageImpl#getDescendantOf()
     * @generated
     */
    EClass DESCENDANT_OF = eINSTANCE.getDescendantOf();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DESCENDANT_OF__CONSTRAINT = eINSTANCE.getDescendantOf_Constraint();

    /**
     * The meta object literal for the '{@link com.b2international.snowowl.snomed.ecl.ecl.impl.DescendantOrSelfOfImpl <em>Descendant Or Self Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snowowl.snomed.ecl.ecl.impl.DescendantOrSelfOfImpl
     * @see com.b2international.snowowl.snomed.ecl.ecl.impl.EclPackageImpl#getDescendantOrSelfOf()
     * @generated
     */
    EClass DESCENDANT_OR_SELF_OF = eINSTANCE.getDescendantOrSelfOf();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DESCENDANT_OR_SELF_OF__CONSTRAINT = eINSTANCE.getDescendantOrSelfOf_Constraint();

    /**
     * The meta object literal for the '{@link com.b2international.snowowl.snomed.ecl.ecl.impl.ParentOfImpl <em>Parent Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snowowl.snomed.ecl.ecl.impl.ParentOfImpl
     * @see com.b2international.snowowl.snomed.ecl.ecl.impl.EclPackageImpl#getParentOf()
     * @generated
     */
    EClass PARENT_OF = eINSTANCE.getParentOf();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARENT_OF__CONSTRAINT = eINSTANCE.getParentOf_Constraint();

    /**
     * The meta object literal for the '{@link com.b2international.snowowl.snomed.ecl.ecl.impl.AncestorOfImpl <em>Ancestor Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snowowl.snomed.ecl.ecl.impl.AncestorOfImpl
     * @see com.b2international.snowowl.snomed.ecl.ecl.impl.EclPackageImpl#getAncestorOf()
     * @generated
     */
    EClass ANCESTOR_OF = eINSTANCE.getAncestorOf();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANCESTOR_OF__CONSTRAINT = eINSTANCE.getAncestorOf_Constraint();

    /**
     * The meta object literal for the '{@link com.b2international.snowowl.snomed.ecl.ecl.impl.AncestorOrSelfOfImpl <em>Ancestor Or Self Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snowowl.snomed.ecl.ecl.impl.AncestorOrSelfOfImpl
     * @see com.b2international.snowowl.snomed.ecl.ecl.impl.EclPackageImpl#getAncestorOrSelfOf()
     * @generated
     */
    EClass ANCESTOR_OR_SELF_OF = eINSTANCE.getAncestorOrSelfOf();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANCESTOR_OR_SELF_OF__CONSTRAINT = eINSTANCE.getAncestorOrSelfOf_Constraint();

    /**
     * The meta object literal for the '{@link com.b2international.snowowl.snomed.ecl.ecl.impl.MemberOfImpl <em>Member Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snowowl.snomed.ecl.ecl.impl.MemberOfImpl
     * @see com.b2international.snowowl.snomed.ecl.ecl.impl.EclPackageImpl#getMemberOf()
     * @generated
     */
    EClass MEMBER_OF = eINSTANCE.getMemberOf();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMBER_OF__CONSTRAINT = eINSTANCE.getMemberOf_Constraint();

    /**
     * The meta object literal for the '{@link com.b2international.snowowl.snomed.ecl.ecl.impl.ConceptReferenceImpl <em>Concept Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snowowl.snomed.ecl.ecl.impl.ConceptReferenceImpl
     * @see com.b2international.snowowl.snomed.ecl.ecl.impl.EclPackageImpl#getConceptReference()
     * @generated
     */
    EClass CONCEPT_REFERENCE = eINSTANCE.getConceptReference();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONCEPT_REFERENCE__ID = eINSTANCE.getConceptReference_Id();

    /**
     * The meta object literal for the '<em><b>Term</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONCEPT_REFERENCE__TERM = eINSTANCE.getConceptReference_Term();

    /**
     * The meta object literal for the '{@link com.b2international.snowowl.snomed.ecl.ecl.impl.AnyImpl <em>Any</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snowowl.snomed.ecl.ecl.impl.AnyImpl
     * @see com.b2international.snowowl.snomed.ecl.ecl.impl.EclPackageImpl#getAny()
     * @generated
     */
    EClass ANY = eINSTANCE.getAny();

    /**
     * The meta object literal for the '{@link com.b2international.snowowl.snomed.ecl.ecl.impl.RefinementImpl <em>Refinement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snowowl.snomed.ecl.ecl.impl.RefinementImpl
     * @see com.b2international.snowowl.snomed.ecl.ecl.impl.EclPackageImpl#getRefinement()
     * @generated
     */
    EClass REFINEMENT = eINSTANCE.getRefinement();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFINEMENT__ATTRIBUTE = eINSTANCE.getRefinement_Attribute();

    /**
     * The meta object literal for the '<em><b>Comparison</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFINEMENT__COMPARISON = eINSTANCE.getRefinement_Comparison();

    /**
     * The meta object literal for the '{@link com.b2international.snowowl.snomed.ecl.ecl.impl.ComparisonImpl <em>Comparison</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snowowl.snomed.ecl.ecl.impl.ComparisonImpl
     * @see com.b2international.snowowl.snomed.ecl.ecl.impl.EclPackageImpl#getComparison()
     * @generated
     */
    EClass COMPARISON = eINSTANCE.getComparison();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARISON__CONSTRAINT = eINSTANCE.getComparison_Constraint();

    /**
     * The meta object literal for the '{@link com.b2international.snowowl.snomed.ecl.ecl.impl.AttributeValueEqualsImpl <em>Attribute Value Equals</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snowowl.snomed.ecl.ecl.impl.AttributeValueEqualsImpl
     * @see com.b2international.snowowl.snomed.ecl.ecl.impl.EclPackageImpl#getAttributeValueEquals()
     * @generated
     */
    EClass ATTRIBUTE_VALUE_EQUALS = eINSTANCE.getAttributeValueEquals();

    /**
     * The meta object literal for the '{@link com.b2international.snowowl.snomed.ecl.ecl.impl.AttributeValueNotEqualsImpl <em>Attribute Value Not Equals</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snowowl.snomed.ecl.ecl.impl.AttributeValueNotEqualsImpl
     * @see com.b2international.snowowl.snomed.ecl.ecl.impl.EclPackageImpl#getAttributeValueNotEquals()
     * @generated
     */
    EClass ATTRIBUTE_VALUE_NOT_EQUALS = eINSTANCE.getAttributeValueNotEquals();

    /**
     * The meta object literal for the '{@link com.b2international.snowowl.snomed.ecl.ecl.impl.NestedExpressionImpl <em>Nested Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snowowl.snomed.ecl.ecl.impl.NestedExpressionImpl
     * @see com.b2international.snowowl.snomed.ecl.ecl.impl.EclPackageImpl#getNestedExpression()
     * @generated
     */
    EClass NESTED_EXPRESSION = eINSTANCE.getNestedExpression();

    /**
     * The meta object literal for the '<em><b>Nested</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED_EXPRESSION__NESTED = eINSTANCE.getNestedExpression_Nested();

    /**
     * The meta object literal for the '{@link com.b2international.snowowl.snomed.ecl.ecl.impl.OrExpressionConstraintImpl <em>Or Expression Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snowowl.snomed.ecl.ecl.impl.OrExpressionConstraintImpl
     * @see com.b2international.snowowl.snomed.ecl.ecl.impl.EclPackageImpl#getOrExpressionConstraint()
     * @generated
     */
    EClass OR_EXPRESSION_CONSTRAINT = eINSTANCE.getOrExpressionConstraint();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPRESSION_CONSTRAINT__LEFT = eINSTANCE.getOrExpressionConstraint_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPRESSION_CONSTRAINT__RIGHT = eINSTANCE.getOrExpressionConstraint_Right();

    /**
     * The meta object literal for the '{@link com.b2international.snowowl.snomed.ecl.ecl.impl.AndExpressionConstraintImpl <em>And Expression Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snowowl.snomed.ecl.ecl.impl.AndExpressionConstraintImpl
     * @see com.b2international.snowowl.snomed.ecl.ecl.impl.EclPackageImpl#getAndExpressionConstraint()
     * @generated
     */
    EClass AND_EXPRESSION_CONSTRAINT = eINSTANCE.getAndExpressionConstraint();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPRESSION_CONSTRAINT__LEFT = eINSTANCE.getAndExpressionConstraint_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPRESSION_CONSTRAINT__RIGHT = eINSTANCE.getAndExpressionConstraint_Right();

    /**
     * The meta object literal for the '{@link com.b2international.snowowl.snomed.ecl.ecl.impl.ExclusionExpressionConstraintImpl <em>Exclusion Expression Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snowowl.snomed.ecl.ecl.impl.ExclusionExpressionConstraintImpl
     * @see com.b2international.snowowl.snomed.ecl.ecl.impl.EclPackageImpl#getExclusionExpressionConstraint()
     * @generated
     */
    EClass EXCLUSION_EXPRESSION_CONSTRAINT = eINSTANCE.getExclusionExpressionConstraint();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXCLUSION_EXPRESSION_CONSTRAINT__LEFT = eINSTANCE.getExclusionExpressionConstraint_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXCLUSION_EXPRESSION_CONSTRAINT__RIGHT = eINSTANCE.getExclusionExpressionConstraint_Right();

  }

} //EclPackage