package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryAgriculturalAreaTotalIterator theCountry = (CountryAgriculturalAreaTotalIterator)findAncestorWithClass(this, CountryAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theCountry.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

