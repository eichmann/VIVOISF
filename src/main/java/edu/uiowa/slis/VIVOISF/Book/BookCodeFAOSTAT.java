package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(BookCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookCodeFAOSTATIterator theBook = (BookCodeFAOSTATIterator)findAncestorWithClass(this, BookCodeFAOSTATIterator.class);
			pageContext.getOut().print(theBook.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

