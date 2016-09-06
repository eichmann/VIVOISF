package edu.uiowa.slis.VIVOISF.Association;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AssociationHasCollaborator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AssociationHasCollaborator currentInstance = null;
	private static final Log log = LogFactory.getLog(AssociationHasCollaborator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AssociationHasCollaboratorIterator theAssociationHasCollaboratorIterator = (AssociationHasCollaboratorIterator)findAncestorWithClass(this, AssociationHasCollaboratorIterator.class);
			pageContext.getOut().print(theAssociationHasCollaboratorIterator.getHasCollaborator());
		} catch (Exception e) {
			log.error("Can't find enclosing Association for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Association for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

