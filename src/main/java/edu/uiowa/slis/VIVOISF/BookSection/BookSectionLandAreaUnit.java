package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionLandAreaUnit extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionLandAreaUnit currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionLandAreaUnit.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionLandAreaUnitIterator theBookSection = (BookSectionLandAreaUnitIterator)findAncestorWithClass(this, BookSectionLandAreaUnitIterator.class);
			pageContext.getOut().print(theBookSection.getLandAreaUnit());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for landAreaUnit tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for landAreaUnit tag ");
		}
		return SKIP_BODY;
	}
}

