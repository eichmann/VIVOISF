package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(BookHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Book theBook = (Book)findAncestorWithClass(this, Book.class);
			if (!theBook.commitNeeded) {
				pageContext.getOut().print(theBook.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Book for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			Book theBook = (Book)findAncestorWithClass(this, Book.class);
			return theBook.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing Book for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			Book theBook = (Book)findAncestorWithClass(this, Book.class);
			theBook.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing Book for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for hideFromDisplay tag ");
		}
	}
}

