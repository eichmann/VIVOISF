package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(BookNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookNameShortENIterator theBook = (BookNameShortENIterator)findAncestorWithClass(this, BookNameShortENIterator.class);
			pageContext.getOut().print(theBook.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

