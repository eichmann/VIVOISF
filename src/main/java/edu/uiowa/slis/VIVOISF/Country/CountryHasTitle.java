package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryHasTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CountryHasTitleIterator theCountryHasTitleIterator = (CountryHasTitleIterator)findAncestorWithClass(this, CountryHasTitleIterator.class);
			pageContext.getOut().print(theCountryHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

