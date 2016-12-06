package edu.uiowa.slis.VIVOISF.GeographicLocation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class GeographicLocationNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static GeographicLocationNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(GeographicLocationNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			GeographicLocationNameCurrencyESIterator theGeographicLocation = (GeographicLocationNameCurrencyESIterator)findAncestorWithClass(this, GeographicLocationNameCurrencyESIterator.class);
			pageContext.getOut().print(theGeographicLocation.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing GeographicLocation for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing GeographicLocation for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

