package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicInterviewerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicInterviewerType currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicInterviewerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicInterviewerIterator theNonAcademicInterviewerIterator = (NonAcademicInterviewerIterator)findAncestorWithClass(this, NonAcademicInterviewerIterator.class);
			pageContext.getOut().print(theNonAcademicInterviewerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

