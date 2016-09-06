package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryCodeAGROVOCIterator theCountry = (CountryCodeAGROVOCIterator)findAncestorWithClass(this, CountryCodeAGROVOCIterator.class);
			pageContext.getOut().print(theCountry.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

