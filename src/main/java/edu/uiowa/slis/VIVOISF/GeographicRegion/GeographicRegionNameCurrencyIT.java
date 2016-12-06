package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionNameCurrencyITIterator theGeographicRegion = (GeographicRegionNameCurrencyITIterator)findAncestorWithClass(this, GeographicRegionNameCurrencyITIterator.class);
			pageContext.getOut().print(theGeographicRegion.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

