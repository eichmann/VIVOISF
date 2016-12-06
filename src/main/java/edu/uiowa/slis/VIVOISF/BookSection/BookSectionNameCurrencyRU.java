package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionNameCurrencyRUIterator theBookSection = (BookSectionNameCurrencyRUIterator)findAncestorWithClass(this, BookSectionNameCurrencyRUIterator.class);
			pageContext.getOut().print(theBookSection.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

