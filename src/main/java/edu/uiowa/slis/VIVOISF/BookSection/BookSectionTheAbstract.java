package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionTheAbstractIterator theBookSection = (BookSectionTheAbstractIterator)findAncestorWithClass(this, BookSectionTheAbstractIterator.class);
			pageContext.getOut().print(theBookSection.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

