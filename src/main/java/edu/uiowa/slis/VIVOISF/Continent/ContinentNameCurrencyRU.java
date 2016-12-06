package edu.uiowa.slis.VIVOISF.Continent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContinentNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ContinentNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ContinentNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ContinentNameCurrencyRUIterator theContinent = (ContinentNameCurrencyRUIterator)findAncestorWithClass(this, ContinentNameCurrencyRUIterator.class);
			pageContext.getOut().print(theContinent.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Continent for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Continent for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

