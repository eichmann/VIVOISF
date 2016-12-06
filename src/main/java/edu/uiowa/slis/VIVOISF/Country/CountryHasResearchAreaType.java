package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CountryHasResearchAreaIterator theCountryHasResearchAreaIterator = (CountryHasResearchAreaIterator)findAncestorWithClass(this, CountryHasResearchAreaIterator.class);
			pageContext.getOut().print(theCountryHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}
