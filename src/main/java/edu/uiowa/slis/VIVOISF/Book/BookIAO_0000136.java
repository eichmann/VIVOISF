package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(BookIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookIAO_0000136Iterator theBookIAO_0000136Iterator = (BookIAO_0000136Iterator)findAncestorWithClass(this, BookIAO_0000136Iterator.class);
			pageContext.getOut().print(theBookIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

