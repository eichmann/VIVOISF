package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationNameCurrencyENIterator theLocation = (LocationNameCurrencyENIterator)findAncestorWithClass(this, LocationNameCurrencyENIterator.class);
			pageContext.getOut().print(theLocation.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

