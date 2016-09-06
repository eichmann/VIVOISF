package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookPublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookPublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookPublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookPublisherIterator theBookPublisherIterator = (BookPublisherIterator)findAncestorWithClass(this, BookPublisherIterator.class);
			pageContext.getOut().print(theBookPublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for publisher tag ");
		}
		return SKIP_BODY;
	}
}

