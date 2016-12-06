package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionCodeUNDP extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionCodeUNDP currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionCodeUNDP.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionCodeUNDPIterator theBookSection = (BookSectionCodeUNDPIterator)findAncestorWithClass(this, BookSectionCodeUNDPIterator.class);
			pageContext.getOut().print(theBookSection.getCodeUNDP());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for codeUNDP tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for codeUNDP tag ");
		}
		return SKIP_BODY;
	}
}

