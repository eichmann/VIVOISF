package edu.uiowa.slis.VIVOISF.NonAcademic;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NonAcademicIntervieweeInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NonAcademicIntervieweeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(NonAcademicIntervieweeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NonAcademicIntervieweeInverseIterator theNonAcademicIntervieweeInverseIterator = (NonAcademicIntervieweeInverseIterator)findAncestorWithClass(this, NonAcademicIntervieweeInverseIterator.class);
			pageContext.getOut().print(theNonAcademicIntervieweeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing NonAcademic for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing NonAcademic for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

