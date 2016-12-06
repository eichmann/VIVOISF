package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(BookNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookNameOfficialENIterator theBook = (BookNameOfficialENIterator)findAncestorWithClass(this, BookNameOfficialENIterator.class);
			pageContext.getOut().print(theBook.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

