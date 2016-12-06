package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionNameCurrencyENIterator theGeographicRegion = (GeographicRegionNameCurrencyENIterator)findAncestorWithClass(this, GeographicRegionNameCurrencyENIterator.class);
			pageContext.getOut().print(theGeographicRegion.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

