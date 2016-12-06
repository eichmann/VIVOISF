package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(BookGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookGDPTotalInCurrentPricesIterator theBook = (BookGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, BookGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theBook.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

