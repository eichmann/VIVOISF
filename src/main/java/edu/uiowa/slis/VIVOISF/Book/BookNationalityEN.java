package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(BookNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookNationalityENIterator theBook = (BookNationalityENIterator)findAncestorWithClass(this, BookNationalityENIterator.class);
			pageContext.getOut().print(theBook.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

