package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionNameCurrencyESIterator theGeographicRegion = (GeographicRegionNameCurrencyESIterator)findAncestorWithClass(this, GeographicRegionNameCurrencyESIterator.class);
			pageContext.getOut().print(theGeographicRegion.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

