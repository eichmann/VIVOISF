package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionNameListARIterator theBookSection = (BookSectionNameListARIterator)findAncestorWithClass(this, BookSectionNameListARIterator.class);
			pageContext.getOut().print(theBookSection.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

