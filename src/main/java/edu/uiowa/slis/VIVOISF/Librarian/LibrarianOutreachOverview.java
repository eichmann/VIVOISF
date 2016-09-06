package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianOutreachOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianOutreachOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianOutreachOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Librarian theLibrarian = (Librarian)findAncestorWithClass(this, Librarian.class);
			if (!theLibrarian.commitNeeded) {
				pageContext.getOut().print(theLibrarian.getOutreachOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for outreachOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for outreachOverview tag ");
		}
		return SKIP_BODY;
	}

	public String getOutreachOverview() throws JspTagException {
		try {
			Librarian theLibrarian = (Librarian)findAncestorWithClass(this, Librarian.class);
			return theLibrarian.getOutreachOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing Librarian for outreachOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for outreachOverview tag ");
		}
	}

	public void setOutreachOverview(String outreachOverview) throws JspTagException {
		try {
			Librarian theLibrarian = (Librarian)findAncestorWithClass(this, Librarian.class);
			theLibrarian.setOutreachOverview(outreachOverview);
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for outreachOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for outreachOverview tag ");
		}
	}
}

