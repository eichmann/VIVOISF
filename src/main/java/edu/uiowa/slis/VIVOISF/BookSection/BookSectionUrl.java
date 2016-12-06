package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionUrlIterator theBookSection = (BookSectionUrlIterator)findAncestorWithClass(this, BookSectionUrlIterator.class);
			pageContext.getOut().print(theBookSection.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for url tag ");
		}
		return SKIP_BODY;
	}
}

