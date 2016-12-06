package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(BookNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookNameCurrencyRUIterator theBook = (BookNameCurrencyRUIterator)findAncestorWithClass(this, BookNameCurrencyRUIterator.class);
			pageContext.getOut().print(theBook.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

