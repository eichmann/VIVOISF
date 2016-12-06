package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(BookHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookHasAddressIterator theBookHasAddressIterator = (BookHasAddressIterator)findAncestorWithClass(this, BookHasAddressIterator.class);
			pageContext.getOut().print(theBookHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

