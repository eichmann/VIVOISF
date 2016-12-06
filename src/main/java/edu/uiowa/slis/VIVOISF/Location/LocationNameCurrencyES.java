package edu.uiowa.slis.VIVOISF.Location;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LocationNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LocationNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(LocationNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LocationNameCurrencyESIterator theLocation = (LocationNameCurrencyESIterator)findAncestorWithClass(this, LocationNameCurrencyESIterator.class);
			pageContext.getOut().print(theLocation.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing Location for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Location for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

