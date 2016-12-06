package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionNameShortITIterator theBookSection = (BookSectionNameShortITIterator)findAncestorWithClass(this, BookSectionNameShortITIterator.class);
			pageContext.getOut().print(theBookSection.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

