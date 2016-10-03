package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionSection currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionSectionIterator theBookSection = (BookSectionSectionIterator)findAncestorWithClass(this, BookSectionSectionIterator.class);
			pageContext.getOut().print(theBookSection.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for section tag ");
		}
		return SKIP_BODY;
	}
}

