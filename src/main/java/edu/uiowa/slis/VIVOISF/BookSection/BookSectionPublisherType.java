package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionPublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionPublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionPublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionPublisherIterator theBookSectionPublisherIterator = (BookSectionPublisherIterator)findAncestorWithClass(this, BookSectionPublisherIterator.class);
			pageContext.getOut().print(theBookSectionPublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for publisher tag ");
		}
		return SKIP_BODY;
	}
}

