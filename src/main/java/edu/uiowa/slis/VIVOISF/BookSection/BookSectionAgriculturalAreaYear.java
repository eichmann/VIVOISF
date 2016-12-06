package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionAgriculturalAreaYearIterator theBookSection = (BookSectionAgriculturalAreaYearIterator)findAncestorWithClass(this, BookSectionAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(theBookSection.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

