package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonRelates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonRelates currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonRelates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonRelatesIterator thePersonRelatesIterator = (PersonRelatesIterator)findAncestorWithClass(this, PersonRelatesIterator.class);
			pageContext.getOut().print(thePersonRelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for relates tag ");
		}
		return SKIP_BODY;
	}
}

