package edu.uiowa.slis.VIVOISF.School;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SchoolIntervieweeInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SchoolIntervieweeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(SchoolIntervieweeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SchoolIntervieweeInverseIterator theSchoolIntervieweeInverseIterator = (SchoolIntervieweeInverseIterator)findAncestorWithClass(this, SchoolIntervieweeInverseIterator.class);
			pageContext.getOut().print(theSchoolIntervieweeInverseIterator.getIntervieweeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing School for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for interviewee tag ");
		}
		return SKIP_BODY;
	}
}
