package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookRO_0001025Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookRO_0001025Type currentInstance = null;
	private static final Log log = LogFactory.getLog(BookRO_0001025Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookRO_0001025Iterator theBookRO_0001025Iterator = (BookRO_0001025Iterator)findAncestorWithClass(this, BookRO_0001025Iterator.class);
			pageContext.getOut().print(theBookRO_0001025Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

