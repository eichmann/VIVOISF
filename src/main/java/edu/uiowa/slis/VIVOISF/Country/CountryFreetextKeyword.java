package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryFreetextKeywordIterator theCountry = (CountryFreetextKeywordIterator)findAncestorWithClass(this, CountryFreetextKeywordIterator.class);
			pageContext.getOut().print(theCountry.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

