package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonNameCurrencyITIterator thePerson = (PersonNameCurrencyITIterator)findAncestorWithClass(this, PersonNameCurrencyITIterator.class);
			pageContext.getOut().print(thePerson.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

