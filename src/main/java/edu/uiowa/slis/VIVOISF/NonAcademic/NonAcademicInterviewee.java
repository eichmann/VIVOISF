package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicInterviewee extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicInterviewee currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicInterviewee.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicIntervieweeIterator theNonAcademicIntervieweeIterator = (NonAcademicIntervieweeIterator)findAncestorWithClass(this, NonAcademicIntervieweeIterator.class);
			pageContext.getOut().print(theNonAcademicIntervieweeIterator.getInterviewee());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

