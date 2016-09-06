package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionPresentedAtType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionPresentedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionPresentedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionPresentedAtIterator theBookSectionPresentedAtIterator = (BookSectionPresentedAtIterator)findAncestorWithClass(this, BookSectionPresentedAtIterator.class);
			pageContext.getOut().print(theBookSectionPresentedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

