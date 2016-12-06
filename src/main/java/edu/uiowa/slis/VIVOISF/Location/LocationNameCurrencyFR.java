package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationNameCurrencyFRIterator theLocation = (LocationNameCurrencyFRIterator)findAncestorWithClass(this, LocationNameCurrencyFRIterator.class);
			pageContext.getOut().print(theLocation.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

