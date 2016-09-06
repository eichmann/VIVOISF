package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianResearchOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianResearchOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianResearchOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Librarian theLibrarian = (Librarian)findAncestorWithClass(this, Librarian.class);
			if (!theLibrarian.commitNeeded) {
				pageContext.getOut().print(theLibrarian.getResearchOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for researchOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for researchOverview tag ");
		}
		return SKIP_BODY;
	}

	public String getResearchOverview() throws JspTagException {
		try {
			Librarian theLibrarian = (Librarian)findAncestorWithClass(this, Librarian.class);
			return theLibrarian.getResearchOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing Librarian for researchOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for researchOverview tag ");
		}
	}

	public void setResearchOverview(String researchOverview) throws JspTagException {
		try {
			Librarian theLibrarian = (Librarian)findAncestorWithClass(this, Librarian.class);
			theLibrarian.setResearchOverview(researchOverview);
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for researchOverview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for researchOverview tag ");
		}
	}
}

