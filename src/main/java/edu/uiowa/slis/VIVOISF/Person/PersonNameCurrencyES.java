package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonNameCurrencyESIterator thePerson = (PersonNameCurrencyESIterator)findAncestorWithClass(this, PersonNameCurrencyESIterator.class);
			pageContext.getOut().print(thePerson.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

