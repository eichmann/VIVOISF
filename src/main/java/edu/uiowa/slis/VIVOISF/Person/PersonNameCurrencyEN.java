package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonNameCurrencyENIterator thePerson = (PersonNameCurrencyENIterator)findAncestorWithClass(this, PersonNameCurrencyENIterator.class);
			pageContext.getOut().print(thePerson.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

