package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionDoiIterator theBookSection = (BookSectionDoiIterator)findAncestorWithClass(this, BookSectionDoiIterator.class);
			pageContext.getOut().print(theBookSection.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for doi tag ");
		}
		return SKIP_BODY;
	}
}

