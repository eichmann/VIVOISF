package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationNameCurrencyRUIterator theGeographicLocation = (GeographicLocationNameCurrencyRUIterator)findAncestorWithClass(this, GeographicLocationNameCurrencyRUIterator.class);
			pageContext.getOut().print(theGeographicLocation.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

