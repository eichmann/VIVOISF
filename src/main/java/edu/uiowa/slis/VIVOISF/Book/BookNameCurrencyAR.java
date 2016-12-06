package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(BookNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookNameCurrencyARIterator theBook = (BookNameCurrencyARIterator)findAncestorWithClass(this, BookNameCurrencyARIterator.class);
			pageContext.getOut().print(theBook.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

