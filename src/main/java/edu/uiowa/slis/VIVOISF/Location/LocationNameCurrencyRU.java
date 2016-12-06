package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationNameCurrencyRUIterator theLocation = (LocationNameCurrencyRUIterator)findAncestorWithClass(this, LocationNameCurrencyRUIterator.class);
			pageContext.getOut().print(theLocation.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

