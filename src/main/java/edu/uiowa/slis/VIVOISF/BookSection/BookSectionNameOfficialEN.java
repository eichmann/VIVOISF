package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionNameOfficialENIterator theBookSection = (BookSectionNameOfficialENIterator)findAncestorWithClass(this, BookSectionNameOfficialENIterator.class);
			pageContext.getOut().print(theBookSection.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

