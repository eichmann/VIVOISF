package edu.uiowa.slis.VIVOISF.EditedBook;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditedBookSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditedBookSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(EditedBookSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			EditedBook theEditedBook = (EditedBook)findAncestorWithClass(this, EditedBook.class);
			if (!theEditedBook.commitNeeded) {
				pageContext.getOut().print(theEditedBook.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			EditedBook theEditedBook = (EditedBook)findAncestorWithClass(this, EditedBook.class);
			return theEditedBook.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing EditedBook for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			EditedBook theEditedBook = (EditedBook)findAncestorWithClass(this, EditedBook.class);
			theEditedBook.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing EditedBook for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditedBook for subjectURI tag ");
		}
	}
}

