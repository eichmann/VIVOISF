package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookPresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookPresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(BookPresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookPresentedAtIterator theBookPresentedAtIterator = (BookPresentedAtIterator)findAncestorWithClass(this, BookPresentedAtIterator.class);
			pageContext.getOut().print(theBookPresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

