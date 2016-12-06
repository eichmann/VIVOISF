package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookNameOfficialZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookNameOfficialZH currentInstance = null;
	private static final Log log = LogFactory.getLog(BookNameOfficialZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookNameOfficialZHIterator theBook = (BookNameOfficialZHIterator)findAncestorWithClass(this, BookNameOfficialZHIterator.class);
			pageContext.getOut().print(theBook.getNameOfficialZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for nameOfficialZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for nameOfficialZH tag ");
		}
		return SKIP_BODY;
	}
}

