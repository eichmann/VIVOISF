package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookAuthorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookAuthorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookAuthorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookAuthorListIterator theBookAuthorListIterator = (BookAuthorListIterator)findAncestorWithClass(this, BookAuthorListIterator.class);
			pageContext.getOut().print(theBookAuthorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for authorList tag ");
		}
		return SKIP_BODY;
	}
}

