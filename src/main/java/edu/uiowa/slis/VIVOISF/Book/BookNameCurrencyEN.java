package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(BookNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookNameCurrencyENIterator theBook = (BookNameCurrencyENIterator)findAncestorWithClass(this, BookNameCurrencyENIterator.class);
			pageContext.getOut().print(theBook.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

