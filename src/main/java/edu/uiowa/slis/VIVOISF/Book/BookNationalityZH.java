package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(BookNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BookNationalityZHIterator theBook = (BookNationalityZHIterator)findAncestorWithClass(this, BookNationalityZHIterator.class);
			pageContext.getOut().print(theBook.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing Book for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

