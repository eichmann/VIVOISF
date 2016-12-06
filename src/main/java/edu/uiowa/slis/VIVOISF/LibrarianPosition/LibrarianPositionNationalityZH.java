package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionNationalityZHIterator theLibrarianPosition = (LibrarianPositionNationalityZHIterator)findAncestorWithClass(this, LibrarianPositionNationalityZHIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

