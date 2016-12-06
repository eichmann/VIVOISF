package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionCodeUNIterator theBookSection = (BookSectionCodeUNIterator)findAncestorWithClass(this, BookSectionCodeUNIterator.class);
			pageContext.getOut().print(theBookSection.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

