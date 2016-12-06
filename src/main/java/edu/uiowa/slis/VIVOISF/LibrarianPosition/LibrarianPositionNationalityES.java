package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionNationalityESIterator theLibrarianPosition = (LibrarianPositionNationalityESIterator)findAncestorWithClass(this, LibrarianPositionNationalityESIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

