package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionLandAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionLandAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionLandAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionLandAreaYearIterator theBookSection = (BookSectionLandAreaYearIterator)findAncestorWithClass(this, BookSectionLandAreaYearIterator.class);
			pageContext.getOut().print(theBookSection.getLandAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for landAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for landAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

