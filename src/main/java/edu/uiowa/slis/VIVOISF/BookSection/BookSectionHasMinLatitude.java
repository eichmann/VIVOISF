package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionHasMinLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionHasMinLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionHasMinLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionHasMinLatitudeIterator theBookSection = (BookSectionHasMinLatitudeIterator)findAncestorWithClass(this, BookSectionHasMinLatitudeIterator.class);
			pageContext.getOut().print(theBookSection.getHasMinLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for hasMinLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for hasMinLatitude tag ");
		}
		return SKIP_BODY;
	}
}

