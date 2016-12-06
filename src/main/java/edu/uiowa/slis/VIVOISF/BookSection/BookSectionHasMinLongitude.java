package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionHasMinLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionHasMinLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionHasMinLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionHasMinLongitudeIterator theBookSection = (BookSectionHasMinLongitudeIterator)findAncestorWithClass(this, BookSectionHasMinLongitudeIterator.class);
			pageContext.getOut().print(theBookSection.getHasMinLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for hasMinLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for hasMinLongitude tag ");
		}
		return SKIP_BODY;
	}
}

