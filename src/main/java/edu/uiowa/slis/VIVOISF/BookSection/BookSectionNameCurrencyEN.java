package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionNameCurrencyENIterator theBookSection = (BookSectionNameCurrencyENIterator)findAncestorWithClass(this, BookSectionNameCurrencyENIterator.class);
			pageContext.getOut().print(theBookSection.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

