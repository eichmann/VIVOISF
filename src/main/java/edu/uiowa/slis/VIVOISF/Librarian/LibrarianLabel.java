package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Librarian theLibrarian = (Librarian)findAncestorWithClass(this, Librarian.class);
			if (!theLibrarian.commitNeeded) {
				pageContext.getOut().print(theLibrarian.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Librarian theLibrarian = (Librarian)findAncestorWithClass(this, Librarian.class);
			return theLibrarian.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Librarian for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Librarian theLibrarian = (Librarian)findAncestorWithClass(this, Librarian.class);
			theLibrarian.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for label tag ");
		}
	}
}

