package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(BookNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookNameCurrencyITIterator theBook = (BookNameCurrencyITIterator)findAncestorWithClass(this, BookNameCurrencyITIterator.class);
			pageContext.getOut().print(theBook.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

