package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionPublisherType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionPublisherType currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionPublisherType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionPublisherIterator theLibrarianPositionPublisherIterator = (LibrarianPositionPublisherIterator)findAncestorWithClass(this, LibrarianPositionPublisherIterator.class);
			pageContext.getOut().print(theLibrarianPositionPublisherIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for publisher tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for publisher tag ");
		}
		return SKIP_BODY;
	}
}

