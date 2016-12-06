package edu.uiowa.slis.VIVOISF.UO_0000280;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class UO_0000280CountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static UO_0000280CountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(UO_0000280CountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			UO_0000280CountryAreaTotalIterator theUO_0000280 = (UO_0000280CountryAreaTotalIterator)findAncestorWithClass(this, UO_0000280CountryAreaTotalIterator.class);
			pageContext.getOut().print(theUO_0000280.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing UO_0000280 for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing UO_0000280 for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

