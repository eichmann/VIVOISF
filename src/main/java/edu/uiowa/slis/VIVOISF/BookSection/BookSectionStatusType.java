package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionStatusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionStatusIterator theBookSectionStatusIterator = (BookSectionStatusIterator)findAncestorWithClass(this, BookSectionStatusIterator.class);
			pageContext.getOut().print(theBookSectionStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for status tag ");
		}
		return SKIP_BODY;
	}
}

