package edu.uiowa.slis.VIVOISF.geographical_region;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class geographical_regionNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static geographical_regionNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(geographical_regionNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			geographical_regionNameCurrencyRUIterator thegeographical_region = (geographical_regionNameCurrencyRUIterator)findAncestorWithClass(this, geographical_regionNameCurrencyRUIterator.class);
			pageContext.getOut().print(thegeographical_region.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing geographical_region for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing geographical_region for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

