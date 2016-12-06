package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionHDITotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionHDITotal currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionHDITotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionHDITotalIterator theBookSection = (BookSectionHDITotalIterator)findAncestorWithClass(this, BookSectionHDITotalIterator.class);
			pageContext.getOut().print(theBookSection.getHDITotal());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for HDITotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for HDITotal tag ");
		}
		return SKIP_BODY;
	}
}

