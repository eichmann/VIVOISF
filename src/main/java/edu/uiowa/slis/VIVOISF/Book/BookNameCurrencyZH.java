package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(BookNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookNameCurrencyZHIterator theBook = (BookNameCurrencyZHIterator)findAncestorWithClass(this, BookNameCurrencyZHIterator.class);
			pageContext.getOut().print(theBook.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

