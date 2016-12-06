package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionNameShortARIterator theBookSection = (BookSectionNameShortARIterator)findAncestorWithClass(this, BookSectionNameShortARIterator.class);
			pageContext.getOut().print(theBookSection.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

