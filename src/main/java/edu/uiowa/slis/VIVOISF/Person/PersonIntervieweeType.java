package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonIntervieweeType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonIntervieweeType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonIntervieweeType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonIntervieweeIterator thePersonIntervieweeIterator = (PersonIntervieweeIterator)findAncestorWithClass(this, PersonIntervieweeIterator.class);
			pageContext.getOut().print(thePersonIntervieweeIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

