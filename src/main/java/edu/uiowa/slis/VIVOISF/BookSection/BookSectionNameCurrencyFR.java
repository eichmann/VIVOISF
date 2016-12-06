package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionNameCurrencyFRIterator theBookSection = (BookSectionNameCurrencyFRIterator)findAncestorWithClass(this, BookSectionNameCurrencyFRIterator.class);
			pageContext.getOut().print(theBookSection.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

