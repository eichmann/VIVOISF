package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionRelatesIterator theBookSectionRelatesIterator = (BookSectionRelatesIterator)findAncestorWithClass(this, BookSectionRelatesIterator.class);
			pageContext.getOut().print(theBookSectionRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for relates tag ");
		}
		return SKIP_BODY;
	}
}

