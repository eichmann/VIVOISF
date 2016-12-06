package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(BookHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookHasURLIterator theBookHasURLIterator = (BookHasURLIterator)findAncestorWithClass(this, BookHasURLIterator.class);
			pageContext.getOut().print(theBookHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

