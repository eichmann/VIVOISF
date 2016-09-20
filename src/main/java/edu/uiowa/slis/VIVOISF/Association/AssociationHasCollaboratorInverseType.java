package edu.uiowa.slis.VIVOISF.Association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AssociationHasCollaboratorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AssociationHasCollaboratorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(AssociationHasCollaboratorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AssociationHasCollaboratorInverseIterator theAssociationHasCollaboratorInverseIterator = (AssociationHasCollaboratorInverseIterator)findAncestorWithClass(this, AssociationHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theAssociationHasCollaboratorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Association for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

