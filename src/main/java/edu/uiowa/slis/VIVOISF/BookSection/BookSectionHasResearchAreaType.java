package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionHasResearchAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionHasResearchAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionHasResearchAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionHasResearchAreaIterator theBookSectionHasResearchAreaIterator = (BookSectionHasResearchAreaIterator)findAncestorWithClass(this, BookSectionHasResearchAreaIterator.class);
			pageContext.getOut().print(theBookSectionHasResearchAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

