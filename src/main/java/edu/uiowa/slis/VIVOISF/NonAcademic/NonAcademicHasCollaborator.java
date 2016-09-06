package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicHasCollaborator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicHasCollaborator currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicHasCollaborator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicHasCollaboratorIterator theNonAcademicHasCollaboratorIterator = (NonAcademicHasCollaboratorIterator)findAncestorWithClass(this, NonAcademicHasCollaboratorIterator.class);
			pageContext.getOut().print(theNonAcademicHasCollaboratorIterator.getHasCollaborator());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

