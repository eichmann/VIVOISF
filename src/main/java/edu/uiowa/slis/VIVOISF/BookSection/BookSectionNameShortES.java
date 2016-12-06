package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionNameShortESIterator theBookSection = (BookSectionNameShortESIterator)findAncestorWithClass(this, BookSectionNameShortESIterator.class);
			pageContext.getOut().print(theBookSection.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

