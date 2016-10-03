package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionReviewOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionReviewOf currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionReviewOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionReviewOfIterator theBookSectionReviewOfIterator = (BookSectionReviewOfIterator)findAncestorWithClass(this, BookSectionReviewOfIterator.class);
			pageContext.getOut().print(theBookSectionReviewOfIterator.getReviewOf());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

