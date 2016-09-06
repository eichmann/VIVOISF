package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryLandAreaUnitIterator theCountry = (CountryLandAreaUnitIterator)findAncestorWithClass(this, CountryLandAreaUnitIterator.class);
			pageContext.getOut().print(theCountry.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

