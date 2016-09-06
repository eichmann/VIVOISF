package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryAgriculturalAreaUnitIterator theCountry = (CountryAgriculturalAreaUnitIterator)findAncestorWithClass(this, CountryAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theCountry.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

