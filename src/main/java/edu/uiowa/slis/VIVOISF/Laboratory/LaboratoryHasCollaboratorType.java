package edu.uiowa.slis.VIVOISF.Laboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LaboratoryHasCollaboratorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LaboratoryHasCollaboratorType currentInstance = null;
	private static final Log log = LogFactory.getLog(LaboratoryHasCollaboratorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LaboratoryHasCollaboratorIterator theLaboratoryHasCollaboratorIterator = (LaboratoryHasCollaboratorIterator)findAncestorWithClass(this, LaboratoryHasCollaboratorIterator.class);
			pageContext.getOut().print(theLaboratoryHasCollaboratorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Laboratory for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Laboratory for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

