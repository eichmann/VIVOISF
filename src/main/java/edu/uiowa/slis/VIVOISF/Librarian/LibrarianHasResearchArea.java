package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianHasResearchArea extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianHasResearchArea currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianHasResearchArea.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianHasResearchAreaIterator theLibrarianHasResearchAreaIterator = (LibrarianHasResearchAreaIterator)findAncestorWithClass(this, LibrarianHasResearchAreaIterator.class);
			pageContext.getOut().print(theLibrarianHasResearchAreaIterator.getHasResearchArea());
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for hasResearchArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for hasResearchArea tag ");
		}
		return SKIP_BODY;
	}
}

