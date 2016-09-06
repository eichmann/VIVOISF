package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionTranslatorIterator theBookSectionTranslatorIterator = (BookSectionTranslatorIterator)findAncestorWithClass(this, BookSectionTranslatorIterator.class);
			pageContext.getOut().print(theBookSectionTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for translator tag ");
		}
		return SKIP_BODY;
	}
}

