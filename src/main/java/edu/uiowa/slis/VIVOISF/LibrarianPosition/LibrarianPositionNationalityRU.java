package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionNationalityRUIterator theLibrarianPosition = (LibrarianPositionNationalityRUIterator)findAncestorWithClass(this, LibrarianPositionNationalityRUIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

