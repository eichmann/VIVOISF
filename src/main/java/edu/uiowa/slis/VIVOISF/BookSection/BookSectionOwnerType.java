package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionOwnerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionOwnerType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionOwnerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionOwnerIterator theBookSectionOwnerIterator = (BookSectionOwnerIterator)findAncestorWithClass(this, BookSectionOwnerIterator.class);
			pageContext.getOut().print(theBookSectionOwnerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for owner tag ");
		}
		return SKIP_BODY;
	}
}

