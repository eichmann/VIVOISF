package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(BookTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookTranslatorIterator theBookTranslatorIterator = (BookTranslatorIterator)findAncestorWithClass(this, BookTranslatorIterator.class);
			pageContext.getOut().print(theBookTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for translator tag ");
		}
		return SKIP_BODY;
	}
}

