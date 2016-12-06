package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(BookNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookNationalityARIterator theBook = (BookNationalityARIterator)findAncestorWithClass(this, BookNationalityARIterator.class);
			pageContext.getOut().print(theBook.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

