package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(BookCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookCodeUNDPIterator theBook = (BookCodeUNDPIterator)findAncestorWithClass(this, BookCodeUNDPIterator.class);
			pageContext.getOut().print(theBook.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

