package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookReviewOfIterator theBookReviewOfIterator = (BookReviewOfIterator)findAncestorWithClass(this, BookReviewOfIterator.class);
			pageContext.getOut().print(theBookReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

