package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonCodeISO3Iterator thePerson = (PersonCodeISO3Iterator)findAncestorWithClass(this, PersonCodeISO3Iterator.class);
			pageContext.getOut().print(thePerson.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

