package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(BookGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookGtin14Iterator theBook = (BookGtin14Iterator)findAncestorWithClass(this, BookGtin14Iterator.class);
			pageContext.getOut().print(theBook.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

