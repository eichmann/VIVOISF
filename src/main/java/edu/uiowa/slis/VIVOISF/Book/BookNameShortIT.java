package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(BookNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookNameShortITIterator theBook = (BookNameShortITIterator)findAncestorWithClass(this, BookNameShortITIterator.class);
			pageContext.getOut().print(theBook.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

