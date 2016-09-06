package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryHDITotalIterator theCountry = (CountryHDITotalIterator)findAncestorWithClass(this, CountryHDITotalIterator.class);
			pageContext.getOut().print(theCountry.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

