package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionNameCurrencyZHIterator theBookSection = (BookSectionNameCurrencyZHIterator)findAncestorWithClass(this, BookSectionNameCurrencyZHIterator.class);
			pageContext.getOut().print(theBookSection.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

