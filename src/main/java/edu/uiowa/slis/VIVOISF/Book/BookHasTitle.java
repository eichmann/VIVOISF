package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookHasTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(BookHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookHasTitleIterator theBookHasTitleIterator = (BookHasTitleIterator)findAncestorWithClass(this, BookHasTitleIterator.class);
			pageContext.getOut().print(theBookHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

