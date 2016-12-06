package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonNationalityRUIterator thePerson = (PersonNationalityRUIterator)findAncestorWithClass(this, PersonNationalityRUIterator.class);
			pageContext.getOut().print(thePerson.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

