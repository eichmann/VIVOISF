package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryCodeFAOTERMIterator theCountry = (CountryCodeFAOTERMIterator)findAncestorWithClass(this, CountryCodeFAOTERMIterator.class);
			pageContext.getOut().print(theCountry.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

