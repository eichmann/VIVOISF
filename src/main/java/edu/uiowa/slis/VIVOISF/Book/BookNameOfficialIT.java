package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookNameOfficialIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookNameOfficialIT currentInstance = null;
	private static final Log log = LogFactory.getLog(BookNameOfficialIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookNameOfficialITIterator theBook = (BookNameOfficialITIterator)findAncestorWithClass(this, BookNameOfficialITIterator.class);
			pageContext.getOut().print(theBook.getNameOfficialIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for nameOfficialIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for nameOfficialIT tag ");
		}
		return SKIP_BODY;
	}
}

