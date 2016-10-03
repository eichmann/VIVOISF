package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionAsinIterator theBookSection = (BookSectionAsinIterator)findAncestorWithClass(this, BookSectionAsinIterator.class);
			pageContext.getOut().print(theBookSection.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for asin tag ");
		}
		return SKIP_BODY;
	}
}

