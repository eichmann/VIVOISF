package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionCitesIterator theBookSectionCitesIterator = (BookSectionCitesIterator)findAncestorWithClass(this, BookSectionCitesIterator.class);
			pageContext.getOut().print(theBookSectionCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for cites tag ");
		}
		return SKIP_BODY;
	}
}

