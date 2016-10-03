package edu.uiowa.slis.VIVOISF.School;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SchoolInterviewerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SchoolInterviewerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(SchoolInterviewerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SchoolInterviewerInverseIterator theSchoolInterviewerInverseIterator = (SchoolInterviewerInverseIterator)findAncestorWithClass(this, SchoolInterviewerInverseIterator.class);
			pageContext.getOut().print(theSchoolInterviewerInverseIterator.getInterviewerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing School for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing School for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

