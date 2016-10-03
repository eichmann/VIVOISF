package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicInterviewerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicInterviewerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicInterviewerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicInterviewerInverseIterator theNonAcademicInterviewerInverseIterator = (NonAcademicInterviewerInverseIterator)findAncestorWithClass(this, NonAcademicInterviewerInverseIterator.class);
			pageContext.getOut().print(theNonAcademicInterviewerInverseIterator.getInterviewerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

