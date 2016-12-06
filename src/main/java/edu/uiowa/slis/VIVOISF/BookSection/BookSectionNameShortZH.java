package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionNameShortZHIterator theBookSection = (BookSectionNameShortZHIterator)findAncestorWithClass(this, BookSectionNameShortZHIterator.class);
			pageContext.getOut().print(theBookSection.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

