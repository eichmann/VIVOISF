package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(BookCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookCodeFAOTERMIterator theBook = (BookCodeFAOTERMIterator)findAncestorWithClass(this, BookCodeFAOTERMIterator.class);
			pageContext.getOut().print(theBook.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

