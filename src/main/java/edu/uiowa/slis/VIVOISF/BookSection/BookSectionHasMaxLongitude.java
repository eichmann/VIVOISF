package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionHasMaxLongitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionHasMaxLongitude currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionHasMaxLongitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionHasMaxLongitudeIterator theBookSection = (BookSectionHasMaxLongitudeIterator)findAncestorWithClass(this, BookSectionHasMaxLongitudeIterator.class);
			pageContext.getOut().print(theBookSection.getHasMaxLongitude());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for hasMaxLongitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for hasMaxLongitude tag ");
		}
		return SKIP_BODY;
	}
}

