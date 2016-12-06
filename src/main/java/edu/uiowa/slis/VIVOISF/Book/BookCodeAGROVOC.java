package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(BookCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookCodeAGROVOCIterator theBook = (BookCodeAGROVOCIterator)findAncestorWithClass(this, BookCodeAGROVOCIterator.class);
			pageContext.getOut().print(theBook.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

