package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryHasCollaboratorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryHasCollaboratorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryHasCollaboratorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LaboratoryHasCollaboratorInverseIterator theLaboratoryHasCollaboratorInverseIterator = (LaboratoryHasCollaboratorInverseIterator)findAncestorWithClass(this, LaboratoryHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theLaboratoryHasCollaboratorInverseIterator.getHasCollaboratorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

