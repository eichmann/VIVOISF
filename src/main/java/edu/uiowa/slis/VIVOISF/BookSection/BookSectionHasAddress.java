package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionHasAddress extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionHasAddress currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionHasAddress.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionHasAddressIterator theBookSectionHasAddressIterator = (BookSectionHasAddressIterator)findAncestorWithClass(this, BookSectionHasAddressIterator.class);
			pageContext.getOut().print(theBookSectionHasAddressIterator.getHasAddress());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

