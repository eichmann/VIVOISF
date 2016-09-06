package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratoryHasCollaborator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratoryHasCollaborator currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratoryHasCollaborator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratoryHasCollaboratorIterator theCoreLaboratoryHasCollaboratorIterator = (CoreLaboratoryHasCollaboratorIterator)findAncestorWithClass(this, CoreLaboratoryHasCollaboratorIterator.class);
			pageContext.getOut().print(theCoreLaboratoryHasCollaboratorIterator.getHasCollaborator());
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

