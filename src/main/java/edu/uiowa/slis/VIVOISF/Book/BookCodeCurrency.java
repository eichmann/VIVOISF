package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(BookCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookCodeCurrencyIterator theBook = (BookCodeCurrencyIterator)findAncestorWithClass(this, BookCodeCurrencyIterator.class);
			pageContext.getOut().print(theBook.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

