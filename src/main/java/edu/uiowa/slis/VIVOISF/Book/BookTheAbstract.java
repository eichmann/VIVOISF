package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(BookTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookTheAbstractIterator theBook = (BookTheAbstractIterator)findAncestorWithClass(this, BookTheAbstractIterator.class);
			pageContext.getOut().print(theBook.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

