package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionNameShortFRIterator theBookSection = (BookSectionNameShortFRIterator)findAncestorWithClass(this, BookSectionNameShortFRIterator.class);
			pageContext.getOut().print(theBookSection.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

