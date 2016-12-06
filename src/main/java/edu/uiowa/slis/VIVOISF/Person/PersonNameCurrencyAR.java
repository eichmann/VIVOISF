package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonNameCurrencyARIterator thePerson = (PersonNameCurrencyARIterator)findAncestorWithClass(this, PersonNameCurrencyARIterator.class);
			pageContext.getOut().print(thePerson.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

