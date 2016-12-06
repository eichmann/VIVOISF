package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionCountryAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionCountryAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionCountryAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionCountryAreaTotalIterator theBookSection = (BookSectionCountryAreaTotalIterator)findAncestorWithClass(this, BookSectionCountryAreaTotalIterator.class);
			pageContext.getOut().print(theBookSection.getCountryAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for countryAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for countryAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

