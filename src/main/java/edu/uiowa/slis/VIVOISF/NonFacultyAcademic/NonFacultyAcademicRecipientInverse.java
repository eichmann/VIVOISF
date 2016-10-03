package edu.uiowa.slis.VIVOISF.NonFacultyAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonFacultyAcademicRecipientInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonFacultyAcademicRecipientInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(NonFacultyAcademicRecipientInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonFacultyAcademicRecipientInverseIterator theNonFacultyAcademicRecipientInverseIterator = (NonFacultyAcademicRecipientInverseIterator)findAncestorWithClass(this, NonFacultyAcademicRecipientInverseIterator.class);
			pageContext.getOut().print(theNonFacultyAcademicRecipientInverseIterator.getRecipientInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing NonFacultyAcademic for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonFacultyAcademic for recipient tag ");
		}
		return SKIP_BODY;
	}
}

