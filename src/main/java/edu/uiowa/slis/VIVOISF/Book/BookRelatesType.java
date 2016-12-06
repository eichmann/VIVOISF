package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookRelatesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookRelatesType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookRelatesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookRelatesIterator theBookRelatesIterator = (BookRelatesIterator)findAncestorWithClass(this, BookRelatesIterator.class);
			pageContext.getOut().print(theBookRelatesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for relates tag ");
		}
		return SKIP_BODY;
	}
}

