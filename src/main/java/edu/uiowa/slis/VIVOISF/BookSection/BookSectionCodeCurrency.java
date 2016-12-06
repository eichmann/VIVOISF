package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionCodeCurrencyIterator theBookSection = (BookSectionCodeCurrencyIterator)findAncestorWithClass(this, BookSectionCodeCurrencyIterator.class);
			pageContext.getOut().print(theBookSection.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

