package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookHasTranslation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookHasTranslation currentInstance = null;
	private static final Log log = LogFactory.getLog(BookHasTranslation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookHasTranslationIterator theBookHasTranslationIterator = (BookHasTranslationIterator)findAncestorWithClass(this, BookHasTranslationIterator.class);
			pageContext.getOut().print(theBookHasTranslationIterator.getHasTranslation());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

