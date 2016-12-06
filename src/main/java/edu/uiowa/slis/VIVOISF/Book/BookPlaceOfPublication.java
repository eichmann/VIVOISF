package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(BookPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Book theBook = (Book)findAncestorWithClass(this, Book.class);
			if (!theBook.commitNeeded) {
				pageContext.getOut().print(theBook.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Book for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			Book theBook = (Book)findAncestorWithClass(this, Book.class);
			return theBook.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing Book for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			Book theBook = (Book)findAncestorWithClass(this, Book.class);
			theBook.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing Book for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for placeOfPublication tag ");
		}
	}
}

