package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationNameCurrencyFRIterator theGeographicLocation = (GeographicLocationNameCurrencyFRIterator)findAncestorWithClass(this, GeographicLocationNameCurrencyFRIterator.class);
			pageContext.getOut().print(theGeographicLocation.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

