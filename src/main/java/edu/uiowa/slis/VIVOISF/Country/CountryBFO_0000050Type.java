package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryBFO_0000050Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryBFO_0000050Type currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryBFO_0000050Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CountryBFO_0000050Iterator theCountryBFO_0000050Iterator = (CountryBFO_0000050Iterator)findAncestorWithClass(this, CountryBFO_0000050Iterator.class);
			pageContext.getOut().print(theCountryBFO_0000050Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

