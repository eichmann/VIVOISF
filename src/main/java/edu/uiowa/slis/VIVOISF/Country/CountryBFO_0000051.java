package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryBFO_0000051 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryBFO_0000051 currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryBFO_0000051.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CountryBFO_0000051Iterator theCountryBFO_0000051Iterator = (CountryBFO_0000051Iterator)findAncestorWithClass(this, CountryBFO_0000051Iterator.class);
			pageContext.getOut().print(theCountryBFO_0000051Iterator.getBFO_0000051());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

