package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionHDIYearIterator theBookSection = (BookSectionHDIYearIterator)findAncestorWithClass(this, BookSectionHDIYearIterator.class);
			pageContext.getOut().print(theBookSection.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

