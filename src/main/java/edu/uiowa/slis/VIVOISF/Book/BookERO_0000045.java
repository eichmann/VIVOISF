package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(BookERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookERO_0000045Iterator theBook = (BookERO_0000045Iterator)findAncestorWithClass(this, BookERO_0000045Iterator.class);
			pageContext.getOut().print(theBook.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

