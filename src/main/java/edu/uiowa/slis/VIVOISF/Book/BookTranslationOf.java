package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookTranslationOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookTranslationOf currentInstance = null;
	private static final Log log = LogFactory.getLog(BookTranslationOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookTranslationOfIterator theBookTranslationOfIterator = (BookTranslationOfIterator)findAncestorWithClass(this, BookTranslationOfIterator.class);
			pageContext.getOut().print(theBookTranslationOfIterator.getTranslationOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

