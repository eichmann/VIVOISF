package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionIsbn10Iterator theBookSection = (BookSectionIsbn10Iterator)findAncestorWithClass(this, BookSectionIsbn10Iterator.class);
			pageContext.getOut().print(theBookSection.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

