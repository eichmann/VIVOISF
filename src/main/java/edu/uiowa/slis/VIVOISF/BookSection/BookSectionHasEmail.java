package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionHasEmail extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionHasEmail currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionHasEmail.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionHasEmailIterator theBookSectionHasEmailIterator = (BookSectionHasEmailIterator)findAncestorWithClass(this, BookSectionHasEmailIterator.class);
			pageContext.getOut().print(theBookSectionHasEmailIterator.getHasEmail());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

