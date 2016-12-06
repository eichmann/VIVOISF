package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryHasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryHasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryHasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CountryHasSubjectAreaIterator theCountryHasSubjectAreaIterator = (CountryHasSubjectAreaIterator)findAncestorWithClass(this, CountryHasSubjectAreaIterator.class);
			pageContext.getOut().print(theCountryHasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

