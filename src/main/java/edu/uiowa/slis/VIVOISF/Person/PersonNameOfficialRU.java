package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonNameOfficialRUIterator thePerson = (PersonNameOfficialRUIterator)findAncestorWithClass(this, PersonNameOfficialRUIterator.class);
			pageContext.getOut().print(thePerson.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

