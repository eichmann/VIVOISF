package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionCountryAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionCountryAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionCountryAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionCountryAreaUnitIterator theBookSection = (BookSectionCountryAreaUnitIterator)findAncestorWithClass(this, BookSectionCountryAreaUnitIterator.class);
			pageContext.getOut().print(theBookSection.getCountryAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for countryAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for countryAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

