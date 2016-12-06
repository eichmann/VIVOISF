package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionDescriptionIterator theBookSection = (BookSectionDescriptionIterator)findAncestorWithClass(this, BookSectionDescriptionIterator.class);
			pageContext.getOut().print(theBookSection.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for description tag ");
		}
		return SKIP_BODY;
	}
}

