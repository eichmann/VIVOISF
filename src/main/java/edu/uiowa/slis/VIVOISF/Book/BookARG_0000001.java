package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(BookARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookARG_0000001Iterator theBook = (BookARG_0000001Iterator)findAncestorWithClass(this, BookARG_0000001Iterator.class);
			pageContext.getOut().print(theBook.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

