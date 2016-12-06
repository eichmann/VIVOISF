package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryHasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryHasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryHasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CountryHasURLIterator theCountryHasURLIterator = (CountryHasURLIterator)findAncestorWithClass(this, CountryHasURLIterator.class);
			pageContext.getOut().print(theCountryHasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

