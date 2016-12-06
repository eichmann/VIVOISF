package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionDateTimeValueIterator theLibrarianPositionDateTimeValueIterator = (LibrarianPositionDateTimeValueIterator)findAncestorWithClass(this, LibrarianPositionDateTimeValueIterator.class);
			pageContext.getOut().print(theLibrarianPositionDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

