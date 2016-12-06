package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionFreetextKeywordIterator theBookSection = (BookSectionFreetextKeywordIterator)findAncestorWithClass(this, BookSectionFreetextKeywordIterator.class);
			pageContext.getOut().print(theBookSection.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

