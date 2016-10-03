package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionContent currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionContentIterator theBookSection = (BookSectionContentIterator)findAncestorWithClass(this, BookSectionContentIterator.class);
			pageContext.getOut().print(theBookSection.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for content tag ");
		}
		return SKIP_BODY;
	}
}

