package edu.uiowa.slis.VIVOISF.BookSection;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSectionNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSectionNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSectionNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookSectionNationalityENIterator theBookSection = (BookSectionNationalityENIterator)findAncestorWithClass(this, BookSectionNationalityENIterator.class);
			pageContext.getOut().print(theBookSection.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing BookSection for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing BookSection for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

