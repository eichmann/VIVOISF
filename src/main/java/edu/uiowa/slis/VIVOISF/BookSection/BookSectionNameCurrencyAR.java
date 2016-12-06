package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionNameCurrencyARIterator theBookSection = (BookSectionNameCurrencyARIterator)findAncestorWithClass(this, BookSectionNameCurrencyARIterator.class);
			pageContext.getOut().print(theBookSection.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

