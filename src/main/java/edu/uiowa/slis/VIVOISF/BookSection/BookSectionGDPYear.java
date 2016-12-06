package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionGDPYearIterator theBookSection = (BookSectionGDPYearIterator)findAncestorWithClass(this, BookSectionGDPYearIterator.class);
			pageContext.getOut().print(theBookSection.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

