package edu.uiowa.slis.VIVOISF.BFO_0000002;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BFO_0000002CountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BFO_0000002CountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(BFO_0000002CountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BFO_0000002CountryAreaYearIterator theBFO_0000002 = (BFO_0000002CountryAreaYearIterator)findAncestorWithClass(this, BFO_0000002CountryAreaYearIterator.class);
			pageContext.getOut().print(theBFO_0000002.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing BFO_0000002 for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing BFO_0000002 for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

