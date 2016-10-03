package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonIntervieweeInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonIntervieweeInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonIntervieweeInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonIntervieweeInverseIterator thePersonIntervieweeInverseIterator = (PersonIntervieweeInverseIterator)findAncestorWithClass(this, PersonIntervieweeInverseIterator.class);
			pageContext.getOut().print(thePersonIntervieweeInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for interviewee tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for interviewee tag ");
		}
		return SKIP_BODY;
	}
}

