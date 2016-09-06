package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionCitedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionCitedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionCitedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionCitedByIterator theBookSectionCitedByIterator = (BookSectionCitedByIterator)findAncestorWithClass(this, BookSectionCitedByIterator.class);
			pageContext.getOut().print(theBookSectionCitedByIterator.getCitedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

