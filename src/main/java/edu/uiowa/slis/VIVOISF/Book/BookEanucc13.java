package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(BookEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookEanucc13Iterator theBook = (BookEanucc13Iterator)findAncestorWithClass(this, BookEanucc13Iterator.class);
			pageContext.getOut().print(theBook.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

