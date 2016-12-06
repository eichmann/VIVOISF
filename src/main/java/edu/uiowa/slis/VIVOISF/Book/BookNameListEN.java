package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(BookNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookNameListENIterator theBook = (BookNameListENIterator)findAncestorWithClass(this, BookNameListENIterator.class);
			pageContext.getOut().print(theBook.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

