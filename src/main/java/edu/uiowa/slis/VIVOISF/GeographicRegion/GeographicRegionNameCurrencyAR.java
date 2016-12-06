package edu.uiowa.slis.VIVOISF.GeographicRegion;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicRegionNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicRegionNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicRegionNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicRegionNameCurrencyARIterator theGeographicRegion = (GeographicRegionNameCurrencyARIterator)findAncestorWithClass(this, GeographicRegionNameCurrencyARIterator.class);
			pageContext.getOut().print(theGeographicRegion.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicRegion for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicRegion for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

