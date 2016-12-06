package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonNameCurrencyRUIterator thePerson = (PersonNameCurrencyRUIterator)findAncestorWithClass(this, PersonNameCurrencyRUIterator.class);
			pageContext.getOut().print(thePerson.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

