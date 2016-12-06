package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookRO_0001015 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookRO_0001015 currentInstance = null;
	private static final Log log = LogFactory.getLog(BookRO_0001015.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookRO_0001015Iterator theBookRO_0001015Iterator = (BookRO_0001015Iterator)findAncestorWithClass(this, BookRO_0001015Iterator.class);
			pageContext.getOut().print(theBookRO_0001015Iterator.getRO_0001015());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}

