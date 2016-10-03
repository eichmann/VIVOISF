package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionLocatorIterator theBookSection = (BookSectionLocatorIterator)findAncestorWithClass(this, BookSectionLocatorIterator.class);
			pageContext.getOut().print(theBookSection.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for locator tag ");
		}
		return SKIP_BODY;
	}
}

