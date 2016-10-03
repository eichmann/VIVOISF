package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonInterviewerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonInterviewerType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonInterviewerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonInterviewerIterator thePersonInterviewerIterator = (PersonInterviewerIterator)findAncestorWithClass(this, PersonInterviewerIterator.class);
			pageContext.getOut().print(thePersonInterviewerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for interviewer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for interviewer tag ");
		}
		return SKIP_BODY;
	}
}

