package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionCodeGAULIterator theBookSection = (BookSectionCodeGAULIterator)findAncestorWithClass(this, BookSectionCodeGAULIterator.class);
			pageContext.getOut().print(theBookSection.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

