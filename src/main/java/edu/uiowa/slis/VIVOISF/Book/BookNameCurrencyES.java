package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(BookNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookNameCurrencyESIterator theBook = (BookNameCurrencyESIterator)findAncestorWithClass(this, BookNameCurrencyESIterator.class);
			pageContext.getOut().print(theBook.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

