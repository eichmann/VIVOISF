package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionIdentifierIterator theBookSection = (BookSectionIdentifierIterator)findAncestorWithClass(this, BookSectionIdentifierIterator.class);
			pageContext.getOut().print(theBookSection.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for identifier tag ");
		}
		return SKIP_BODY;
	}
}

