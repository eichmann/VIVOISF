package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryHasTitleType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CountryHasTitleIterator theCountryHasTitleIterator = (CountryHasTitleIterator)findAncestorWithClass(this, CountryHasTitleIterator.class);
			pageContext.getOut().print(theCountryHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

