package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookRank currentInstance = null;
	private static final Log log = LogFactory.getLog(BookRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookRankIterator theBook = (BookRankIterator)findAncestorWithClass(this, BookRankIterator.class);
			pageContext.getOut().print(theBook.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for rank tag ");
		}
		return SKIP_BODY;
	}
}

