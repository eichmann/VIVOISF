package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionLandAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionLandAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionLandAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionLandAreaTotalIterator theBookSection = (BookSectionLandAreaTotalIterator)findAncestorWithClass(this, BookSectionLandAreaTotalIterator.class);
			pageContext.getOut().print(theBookSection.getLandAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for landAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for landAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}

