package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationNameCurrencyITIterator theLocation = (LocationNameCurrencyITIterator)findAncestorWithClass(this, LocationNameCurrencyITIterator.class);
			pageContext.getOut().print(theLocation.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

