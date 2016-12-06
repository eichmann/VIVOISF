package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionHasMaxLatitude extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionHasMaxLatitude currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionHasMaxLatitude.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionHasMaxLatitudeIterator theBookSection = (BookSectionHasMaxLatitudeIterator)findAncestorWithClass(this, BookSectionHasMaxLatitudeIterator.class);
			pageContext.getOut().print(theBookSection.getHasMaxLatitude());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for hasMaxLatitude tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for hasMaxLatitude tag ");
		}
		return SKIP_BODY;
	}
}

