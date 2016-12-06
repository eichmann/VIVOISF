package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookRO_0002234 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookRO_0002234 currentInstance = null;
	private static final Log log = LogFactory.getLog(BookRO_0002234.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookRO_0002234Iterator theBookRO_0002234Iterator = (BookRO_0002234Iterator)findAncestorWithClass(this, BookRO_0002234Iterator.class);
			pageContext.getOut().print(theBookRO_0002234Iterator.getRO_0002234());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

