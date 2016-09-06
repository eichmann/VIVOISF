package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPosition theLibrarianPosition = (LibrarianPosition)findAncestorWithClass(this, LibrarianPosition.class);
			if (!theLibrarianPosition.commitNeeded) {
				pageContext.getOut().print(theLibrarianPosition.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			LibrarianPosition theLibrarianPosition = (LibrarianPosition)findAncestorWithClass(this, LibrarianPosition.class);
			return theLibrarianPosition.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing LibrarianPosition for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			LibrarianPosition theLibrarianPosition = (LibrarianPosition)findAncestorWithClass(this, LibrarianPosition.class);
			theLibrarianPosition.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for subjectURI tag ");
		}
	}
}

