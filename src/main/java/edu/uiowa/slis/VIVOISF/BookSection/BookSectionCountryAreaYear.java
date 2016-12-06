package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionCountryAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionCountryAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionCountryAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionCountryAreaYearIterator theBookSection = (BookSectionCountryAreaYearIterator)findAncestorWithClass(this, BookSectionCountryAreaYearIterator.class);
			pageContext.getOut().print(theBookSection.getCountryAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for countryAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for countryAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

