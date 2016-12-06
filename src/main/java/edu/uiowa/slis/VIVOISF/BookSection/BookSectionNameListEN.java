package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionNameListENIterator theBookSection = (BookSectionNameListENIterator)findAncestorWithClass(this, BookSectionNameListENIterator.class);
			pageContext.getOut().print(theBookSection.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

