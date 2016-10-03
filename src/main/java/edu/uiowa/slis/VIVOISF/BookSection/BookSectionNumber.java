package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionNumberIterator theBookSection = (BookSectionNumberIterator)findAncestorWithClass(this, BookSectionNumberIterator.class);
			pageContext.getOut().print(theBookSection.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for number tag ");
		}
		return SKIP_BODY;
	}
}

