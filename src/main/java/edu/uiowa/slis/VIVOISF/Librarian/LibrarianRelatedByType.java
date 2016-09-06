package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianRelatedByIterator theLibrarianRelatedByIterator = (LibrarianRelatedByIterator)findAncestorWithClass(this, LibrarianRelatedByIterator.class);
			pageContext.getOut().print(theLibrarianRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

