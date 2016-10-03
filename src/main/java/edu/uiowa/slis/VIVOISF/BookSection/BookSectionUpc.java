package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionUpcIterator theBookSection = (BookSectionUpcIterator)findAncestorWithClass(this, BookSectionUpcIterator.class);
			pageContext.getOut().print(theBookSection.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for upc tag ");
		}
		return SKIP_BODY;
	}
}

