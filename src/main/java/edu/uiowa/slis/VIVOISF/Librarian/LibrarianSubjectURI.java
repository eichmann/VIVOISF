package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Librarian theLibrarian = (Librarian)findAncestorWithClass(this, Librarian.class);
			if (!theLibrarian.commitNeeded) {
				pageContext.getOut().print(theLibrarian.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Librarian theLibrarian = (Librarian)findAncestorWithClass(this, Librarian.class);
			return theLibrarian.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Librarian for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Librarian theLibrarian = (Librarian)findAncestorWithClass(this, Librarian.class);
			theLibrarian.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for subjectURI tag ");
		}
	}
}

