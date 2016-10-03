package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonIntervieweeInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonIntervieweeInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonIntervieweeInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonIntervieweeInverseIterator thePersonIntervieweeInverseIterator = (PersonIntervieweeInverseIterator)findAncestorWithClass(this, PersonIntervieweeInverseIterator.class);
			pageContext.getOut().print(thePersonIntervieweeInverseIterator.getIntervieweeInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

