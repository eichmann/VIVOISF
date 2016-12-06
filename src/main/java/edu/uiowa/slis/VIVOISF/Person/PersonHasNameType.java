package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonHasNameType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonHasNameType currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonHasNameType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonHasNameIterator thePersonHasNameIterator = (PersonHasNameIterator)findAncestorWithClass(this, PersonHasNameIterator.class);
			pageContext.getOut().print(thePersonHasNameIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for hasName tag ");
		}
		return SKIP_BODY;
	}
}

