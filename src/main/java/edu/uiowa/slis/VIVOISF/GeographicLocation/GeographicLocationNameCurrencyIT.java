package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationNameCurrencyITIterator theGeographicLocation = (GeographicLocationNameCurrencyITIterator)findAncestorWithClass(this, GeographicLocationNameCurrencyITIterator.class);
			pageContext.getOut().print(theGeographicLocation.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

