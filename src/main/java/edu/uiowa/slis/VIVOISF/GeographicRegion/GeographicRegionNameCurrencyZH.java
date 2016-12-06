package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionNameCurrencyZHIterator theGeographicRegion = (GeographicRegionNameCurrencyZHIterator)findAncestorWithClass(this, GeographicRegionNameCurrencyZHIterator.class);
			pageContext.getOut().print(theGeographicRegion.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

