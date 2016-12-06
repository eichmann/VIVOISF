package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonNameCurrencyFRIterator thePerson = (PersonNameCurrencyFRIterator)findAncestorWithClass(this, PersonNameCurrencyFRIterator.class);
			pageContext.getOut().print(thePerson.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

