package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationNameCurrencyENIterator theGeographicLocation = (GeographicLocationNameCurrencyENIterator)findAncestorWithClass(this, GeographicLocationNameCurrencyENIterator.class);
			pageContext.getOut().print(theGeographicLocation.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

