package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(BookLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Book theBook = (Book)findAncestorWithClass(this, Book.class);
			if (!theBook.commitNeeded) {
				pageContext.getOut().print(theBook.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Book for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Book theBook = (Book)findAncestorWithClass(this, Book.class);
			return theBook.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Book for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Book theBook = (Book)findAncestorWithClass(this, Book.class);
			theBook.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Book for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for label tag ");
		}
	}
}

