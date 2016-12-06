package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonHasName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonHasName currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonHasName.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonHasNameIterator thePersonHasNameIterator = (PersonHasNameIterator)findAncestorWithClass(this, PersonHasNameIterator.class);
			pageContext.getOut().print(thePersonHasNameIterator.getHasName());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for hasName tag ");
		}
		return SKIP_BODY;
	}
}

