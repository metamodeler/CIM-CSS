package context.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import context.diagram.providers.CIM3ElementTypes;

/**
 * @generated
 */
public class RelationshipTocontextelement3ItemSemanticEditPolicy extends CIM3BaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public RelationshipTocontextelement3ItemSemanticEditPolicy() {
		super(CIM3ElementTypes.RelationshipTocontextelement_4020);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
