package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionGDPTotalInCurrentPricesIterator theBookSection = (BookSectionGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, BookSectionGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theBookSection.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

