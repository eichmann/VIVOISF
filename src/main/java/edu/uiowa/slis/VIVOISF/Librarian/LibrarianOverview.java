package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Librarian theLibrarian = (Librarian)findAncestorWithClass(this, Librarian.class);
			if (!theLibrarian.commitNeeded) {
				pageContext.getOut().print(theLibrarian.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			Librarian theLibrarian = (Librarian)findAncestorWithClass(this, Librarian.class);
			return theLibrarian.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing Librarian for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			Librarian theLibrarian = (Librarian)findAncestorWithClass(this, Librarian.class);
			theLibrarian.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for overview tag ");
		}
	}
}

