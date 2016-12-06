package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionNameListFRIterator theBookSection = (BookSectionNameListFRIterator)findAncestorWithClass(this, BookSectionNameListFRIterator.class);
			pageContext.getOut().print(theBookSection.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

