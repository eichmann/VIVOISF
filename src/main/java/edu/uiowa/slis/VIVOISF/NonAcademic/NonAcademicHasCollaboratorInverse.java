package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicHasCollaboratorInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicHasCollaboratorInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicHasCollaboratorInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicHasCollaboratorInverseIterator theNonAcademicHasCollaboratorInverseIterator = (NonAcademicHasCollaboratorInverseIterator)findAncestorWithClass(this, NonAcademicHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theNonAcademicHasCollaboratorInverseIterator.getHasCollaboratorInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

