package edu.uiowa.slis.VIVOISF.Country;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CountryHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CountryHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(CountryHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			CountryHDINotesIterator theCountry = (CountryHDINotesIterator)findAncestorWithClass(this, CountryHDINotesIterator.class);
			pageContext.getOut().print(theCountry.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing Country for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Country for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

