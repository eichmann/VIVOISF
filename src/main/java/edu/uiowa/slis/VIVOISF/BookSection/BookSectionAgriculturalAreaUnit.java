package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionAgriculturalAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionAgriculturalAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionAgriculturalAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionAgriculturalAreaUnitIterator theBookSection = (BookSectionAgriculturalAreaUnitIterator)findAncestorWithClass(this, BookSectionAgriculturalAreaUnitIterator.class);
			pageContext.getOut().print(theBookSection.getAgriculturalAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for agriculturalAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for agriculturalAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

