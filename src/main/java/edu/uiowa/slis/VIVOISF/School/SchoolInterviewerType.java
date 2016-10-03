package edu.uiowa.slis.VIVOISF.School;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SchoolInterviewerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SchoolInterviewerType currentInstance = null;
	private static final Log log = LogFactory.getLog(SchoolInterviewerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SchoolInterviewerIterator theSchoolInterviewerIterator = (SchoolInterviewerIterator)findAncestorWithClass(this, SchoolInterviewerIterator.class);
			pageContext.getOut().print(theSchoolInterviewerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing School for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

