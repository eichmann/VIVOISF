package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookTranslationOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookTranslationOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookTranslationOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookTranslationOfIterator theBookTranslationOfIterator = (BookTranslationOfIterator)findAncestorWithClass(this, BookTranslationOfIterator.class);
			pageContext.getOut().print(theBookTranslationOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

