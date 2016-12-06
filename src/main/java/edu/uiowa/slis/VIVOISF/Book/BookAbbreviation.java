package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(BookAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Book theBook = (Book)findAncestorWithClass(this, Book.class);
			if (!theBook.commitNeeded) {
				pageContext.getOut().print(theBook.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Book for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Book theBook = (Book)findAncestorWithClass(this, Book.class);
			return theBook.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Book for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Book theBook = (Book)findAncestorWithClass(this, Book.class);
			theBook.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Book for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for abbreviation tag ");
		}
	}
}

