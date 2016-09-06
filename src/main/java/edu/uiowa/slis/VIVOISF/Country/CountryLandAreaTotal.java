package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryLandAreaTotalIterator theCountry = (CountryLandAreaTotalIterator)findAncestorWithClass(this, CountryLandAreaTotalIterator.class);
			pageContext.getOut().print(theCountry.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

