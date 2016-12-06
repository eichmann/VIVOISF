package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookRO_0002353Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookRO_0002353Type currentInstance = null;
	private static final Log log = LogFactory.getLog(BookRO_0002353Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookRO_0002353Iterator theBookRO_0002353Iterator = (BookRO_0002353Iterator)findAncestorWithClass(this, BookRO_0002353Iterator.class);
			pageContext.getOut().print(theBookRO_0002353Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

