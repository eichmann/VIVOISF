package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonNameCurrencyZHIterator thePerson = (PersonNameCurrencyZHIterator)findAncestorWithClass(this, PersonNameCurrencyZHIterator.class);
			pageContext.getOut().print(thePerson.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

