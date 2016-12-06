package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(BookCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookCodeISO2Iterator theBook = (BookCodeISO2Iterator)findAncestorWithClass(this, BookCodeISO2Iterator.class);
			pageContext.getOut().print(theBook.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

