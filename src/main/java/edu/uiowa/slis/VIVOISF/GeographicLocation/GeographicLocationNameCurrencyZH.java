package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationNameCurrencyZHIterator theGeographicLocation = (GeographicLocationNameCurrencyZHIterator)findAncestorWithClass(this, GeographicLocationNameCurrencyZHIterator.class);
			pageContext.getOut().print(theGeographicLocation.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

