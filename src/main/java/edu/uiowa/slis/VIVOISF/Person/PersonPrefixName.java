package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonPrefixName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonPrefixName currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonPrefixName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonPrefixNameIterator thePerson = (PersonPrefixNameIterator)findAncestorWithClass(this, PersonPrefixNameIterator.class);
			pageContext.getOut().print(thePerson.getPrefixName());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for prefixName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for prefixName tag ");
		}
		return SKIP_BODY;
	}
}

