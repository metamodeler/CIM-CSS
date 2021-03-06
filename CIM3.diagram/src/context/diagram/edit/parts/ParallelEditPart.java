package context.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import context.diagram.edit.policies.ParallelItemSemanticEditPolicy;

/**
 * @generated
 */
public class ParallelEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4003;

	/**
	* @generated
	*/
	public ParallelEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ParallelItemSemanticEditPolicy());
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ParallelNameEditPart) {
			((ParallelNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureParallelNameFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, index);
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ParallelNameEditPart) {
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/

	protected Connection createConnectionFigure() {
		return new ParallelFigure();
	}

	/**
	* @generated
	*/
	public ParallelFigure getPrimaryShape() {
		return (ParallelFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class ParallelFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureParallelNameFigure;

		/**
		 * @generated
		 */
		public ParallelFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureParallelNameFigure = new WrappingLabel();

			fFigureParallelNameFigure.setText("<...>");

			this.add(fFigureParallelNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureParallelNameFigure() {
			return fFigureParallelNameFigure;
		}

	}

}
