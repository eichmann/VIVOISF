package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianTeachingOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianTeachingOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianTeachingOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Librarian theLibrarian = (Librarian)findAncestorWithClass(this, Librarian.class);
			if (!theLibrarian.commitNeeded) {
				pageContext.getOut().print(theLibrarian.getTeachingOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for teachingOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for teachingOverview tag ");
		}
		return SKIP_BODY;
	}

	public String getTeachingOverview() throws JspTagException {
		try {
			Librarian theLibrarian = (Librarian)findAncestorWithClass(this, Librarian.class);
			return theLibrarian.getTeachingOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing Librarian for teachingOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for teachingOverview tag ");
		}
	}

	public void setTeachingOverview(String teachingOverview) throws JspTagException {
		try {
			Librarian theLibrarian = (Librarian)findAncestorWithClass(this, Librarian.class);
			theLibrarian.setTeachingOverview(teachingOverview);
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for teachingOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for teachingOverview tag ");
		}
	}
}

