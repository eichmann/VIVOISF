package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionAuthorListIterator theBookSectionAuthorListIterator = (BookSectionAuthorListIterator)findAncestorWithClass(this, BookSectionAuthorListIterator.class);
			pageContext.getOut().print(theBookSectionAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for authorList tag ");
		}
		return SKIP_BODY;
	}
}

