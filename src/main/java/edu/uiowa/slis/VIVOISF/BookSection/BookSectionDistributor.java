package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionDistributor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionDistributor currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionDistributor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BookSectionDistributorIterator theBookSectionDistributorIterator = (BookSectionDistributorIterator)findAncestorWithClass(this, BookSectionDistributorIterator.class);
			pageContext.getOut().print(theBookSectionDistributorIterator.getDistributor());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for distributor tag ");
		}
		return SKIP_BODY;
	}
}

