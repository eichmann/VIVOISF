package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookHasEmail extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookHasEmail currentInstance = null;
	private static final Log log = LogFactory.getLog(BookHasEmail.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookHasEmailIterator theBookHasEmailIterator = (BookHasEmailIterator)findAncestorWithClass(this, BookHasEmailIterator.class);
			pageContext.getOut().print(theBookHasEmailIterator.getHasEmail());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

