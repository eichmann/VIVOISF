package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianOrcidIdType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianOrcidIdType currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianOrcidIdType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianOrcidIdIterator theLibrarianOrcidIdIterator = (LibrarianOrcidIdIterator)findAncestorWithClass(this, LibrarianOrcidIdIterator.class);
			pageContext.getOut().print(theLibrarianOrcidIdIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for orcidId tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for orcidId tag ");
		}
		return SKIP_BODY;
	}
}

