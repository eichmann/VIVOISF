package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationNameCurrencyARIterator theGeographicLocation = (GeographicLocationNameCurrencyARIterator)findAncestorWithClass(this, GeographicLocationNameCurrencyARIterator.class);
			pageContext.getOut().print(theGeographicLocation.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

