package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionUrlIterator theLibrarianPosition = (LibrarianPositionUrlIterator)findAncestorWithClass(this, LibrarianPositionUrlIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for url tag ");
		}
		return SKIP_BODY;
	}
}
