package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationNameCurrencyZHIterator theLocation = (LocationNameCurrencyZHIterator)findAncestorWithClass(this, LocationNameCurrencyZHIterator.class);
			pageContext.getOut().print(theLocation.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

