package edu.uiowa.slis.VIVOISF.CoreLaboratory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CoreLaboratoryHasCollaboratorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CoreLaboratoryHasCollaboratorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CoreLaboratoryHasCollaboratorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CoreLaboratoryHasCollaboratorInverseIterator theCoreLaboratoryHasCollaboratorInverseIterator = (CoreLaboratoryHasCollaboratorInverseIterator)findAncestorWithClass(this, CoreLaboratoryHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theCoreLaboratoryHasCollaboratorInverseIterator.getHasCollaboratorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing CoreLaboratory for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing CoreLaboratory for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

