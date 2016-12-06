package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(BookNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookNameCurrencyFRIterator theBook = (BookNameCurrencyFRIterator)findAncestorWithClass(this, BookNameCurrencyFRIterator.class);
			pageContext.getOut().print(theBook.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

