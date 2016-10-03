package edu.uiowa.slis.VIVOISF.School;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SchoolIntervieweeType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SchoolIntervieweeType currentInstance = null;
	private static final Log log = LogFactory.getLog(SchoolIntervieweeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SchoolIntervieweeIterator theSchoolIntervieweeIterator = (SchoolIntervieweeIterator)findAncestorWithClass(this, SchoolIntervieweeIterator.class);
			pageContext.getOut().print(theSchoolIntervieweeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing School for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

