package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionOwnerIterator theBookSectionOwnerIterator = (BookSectionOwnerIterator)findAncestorWithClass(this, BookSectionOwnerIterator.class);
			pageContext.getOut().print(theBookSectionOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for owner tag ");
		}
		return SKIP_BODY;
	}
}

