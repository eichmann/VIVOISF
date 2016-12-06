package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonCodeISO2Iterator thePerson = (PersonCodeISO2Iterator)findAncestorWithClass(this, PersonCodeISO2Iterator.class);
			pageContext.getOut().print(thePerson.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

