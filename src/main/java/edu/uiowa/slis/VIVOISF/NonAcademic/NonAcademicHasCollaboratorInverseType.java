package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicHasCollaboratorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicHasCollaboratorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicHasCollaboratorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicHasCollaboratorInverseIterator theNonAcademicHasCollaboratorInverseIterator = (NonAcademicHasCollaboratorInverseIterator)findAncestorWithClass(this, NonAcademicHasCollaboratorInverseIterator.class);
			pageContext.getOut().print(theNonAcademicHasCollaboratorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for hasCollaborator tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for hasCollaborator tag ");
		}
		return SKIP_BODY;
	}
}

