package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookHasEmailIterator theBookHasEmailIterator = (BookHasEmailIterator)findAncestorWithClass(this, BookHasEmailIterator.class);
			pageContext.getOut().print(theBookHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

