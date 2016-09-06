package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonERACommonsId extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonERACommonsId currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonERACommonsId.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonERACommonsIdIterator thePerson = (PersonERACommonsIdIterator)findAncestorWithClass(this, PersonERACommonsIdIterator.class);
			pageContext.getOut().print(thePerson.getERACommonsId());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for eRACommonsId tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for eRACommonsId tag ");
		}
		return SKIP_BODY;
	}
}

