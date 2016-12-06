package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionNameCurrencyESIterator theBookSection = (BookSectionNameCurrencyESIterator)findAncestorWithClass(this, BookSectionNameCurrencyESIterator.class);
			pageContext.getOut().print(theBookSection.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

