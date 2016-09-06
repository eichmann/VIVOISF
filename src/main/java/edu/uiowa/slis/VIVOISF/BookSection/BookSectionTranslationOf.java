package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionTranslationOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionTranslationOf currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionTranslationOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionTranslationOfIterator theBookSectionTranslationOfIterator = (BookSectionTranslationOfIterator)findAncestorWithClass(this, BookSectionTranslationOfIterator.class);
			pageContext.getOut().print(theBookSectionTranslationOfIterator.getTranslationOf());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

