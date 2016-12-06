package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionHasTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionHasTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionHasTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionHasTitleIterator theBookSectionHasTitleIterator = (BookSectionHasTitleIterator)findAncestorWithClass(this, BookSectionHasTitleIterator.class);
			pageContext.getOut().print(theBookSectionHasTitleIterator.getHasTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

