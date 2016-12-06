package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionCodeFAOSTATIterator theBookSection = (BookSectionCodeFAOSTATIterator)findAncestorWithClass(this, BookSectionCodeFAOSTATIterator.class);
			pageContext.getOut().print(theBookSection.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

