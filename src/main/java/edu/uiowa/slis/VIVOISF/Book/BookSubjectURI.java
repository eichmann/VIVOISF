package edu.uiowa.slis.VIVOISF.Book;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BookSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BookSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(BookSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Book theBook = (Book)findAncestorWithClass(this, Book.class);
			if (!theBook.commitNeeded) {
				pageContext.getOut().print(theBook.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Book for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Book theBook = (Book)findAncestorWithClass(this, Book.class);
			return theBook.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Book for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Book theBook = (Book)findAncestorWithClass(this, Book.class);
			theBook.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Book for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Book for subjectURI tag ");
		}
	}
}

