package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionShortDescriptionIterator theBookSection = (BookSectionShortDescriptionIterator)findAncestorWithClass(this, BookSectionShortDescriptionIterator.class);
			pageContext.getOut().print(theBookSection.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

