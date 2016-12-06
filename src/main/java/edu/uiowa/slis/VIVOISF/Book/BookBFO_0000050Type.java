package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookBFO_0000050Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookBFO_0000050Type currentInstance = null;
	private static final Log log = LogFactory.getLog(BookBFO_0000050Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookBFO_0000050Iterator theBookBFO_0000050Iterator = (BookBFO_0000050Iterator)findAncestorWithClass(this, BookBFO_0000050Iterator.class);
			pageContext.getOut().print(theBookBFO_0000050Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

