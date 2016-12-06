package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionNameCurrencyRUIterator theGeographicRegion = (GeographicRegionNameCurrencyRUIterator)findAncestorWithClass(this, GeographicRegionNameCurrencyRUIterator.class);
			pageContext.getOut().print(theGeographicRegion.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

