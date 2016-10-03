package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonSuffixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonSuffixName currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonSuffixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonSuffixNameIterator thePerson = (PersonSuffixNameIterator)findAncestorWithClass(this, PersonSuffixNameIterator.class);
			pageContext.getOut().print(thePerson.getSuffixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for suffixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for suffixName tag ");
		}
		return SKIP_BODY;
	}
}

