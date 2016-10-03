package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionHandleIterator theBookSection = (BookSectionHandleIterator)findAncestorWithClass(this, BookSectionHandleIterator.class);
			pageContext.getOut().print(theBookSection.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for handle tag ");
		}
		return SKIP_BODY;
	}
}

