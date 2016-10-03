package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionCodenIterator theBookSection = (BookSectionCodenIterator)findAncestorWithClass(this, BookSectionCodenIterator.class);
			pageContext.getOut().print(theBookSection.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for coden tag ");
		}
		return SKIP_BODY;
	}
}

