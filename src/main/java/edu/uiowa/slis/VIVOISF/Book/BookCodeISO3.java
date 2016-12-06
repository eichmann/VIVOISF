package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(BookCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookCodeISO3Iterator theBook = (BookCodeISO3Iterator)findAncestorWithClass(this, BookCodeISO3Iterator.class);
			pageContext.getOut().print(theBook.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

