package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookNameOfficialES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookNameOfficialES currentInstance = null;
	private static final Log log = LogFactory.getLog(BookNameOfficialES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookNameOfficialESIterator theBook = (BookNameOfficialESIterator)findAncestorWithClass(this, BookNameOfficialESIterator.class);
			pageContext.getOut().print(theBook.getNameOfficialES());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for nameOfficialES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for nameOfficialES tag ");
		}
		return SKIP_BODY;
	}
}

