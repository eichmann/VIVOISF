package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionUri currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionUriIterator theBookSection = (BookSectionUriIterator)findAncestorWithClass(this, BookSectionUriIterator.class);
			pageContext.getOut().print(theBookSection.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for uri tag ");
		}
		return SKIP_BODY;
	}
}

