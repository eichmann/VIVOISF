package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookNameOfficialFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookNameOfficialFR currentInstance = null;
	private static final Log log = LogFactory.getLog(BookNameOfficialFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookNameOfficialFRIterator theBook = (BookNameOfficialFRIterator)findAncestorWithClass(this, BookNameOfficialFRIterator.class);
			pageContext.getOut().print(theBook.getNameOfficialFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for nameOfficialFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for nameOfficialFR tag ");
		}
		return SKIP_BODY;
	}
}

