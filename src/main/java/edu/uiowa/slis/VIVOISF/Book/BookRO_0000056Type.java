package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(BookRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookRO_0000056Iterator theBookRO_0000056Iterator = (BookRO_0000056Iterator)findAncestorWithClass(this, BookRO_0000056Iterator.class);
			pageContext.getOut().print(theBookRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

