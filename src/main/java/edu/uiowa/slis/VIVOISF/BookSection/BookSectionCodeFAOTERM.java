package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionCodeFAOTERMIterator theBookSection = (BookSectionCodeFAOTERMIterator)findAncestorWithClass(this, BookSectionCodeFAOTERMIterator.class);
			pageContext.getOut().print(theBookSection.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

