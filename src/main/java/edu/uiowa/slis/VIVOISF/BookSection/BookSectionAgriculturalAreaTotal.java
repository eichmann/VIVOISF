package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionAgriculturalAreaTotal extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionAgriculturalAreaTotal currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionAgriculturalAreaTotal.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionAgriculturalAreaTotalIterator theBookSection = (BookSectionAgriculturalAreaTotalIterator)findAncestorWithClass(this, BookSectionAgriculturalAreaTotalIterator.class);
			pageContext.getOut().print(theBookSection.getAgriculturalAreaTotal());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for agriculturalAreaTotal tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for agriculturalAreaTotal tag ");
		}
		return SKIP_BODY;
	}
}
