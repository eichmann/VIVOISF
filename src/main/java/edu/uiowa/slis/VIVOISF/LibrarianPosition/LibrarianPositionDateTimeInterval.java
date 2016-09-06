package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionDateTimeInterval extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionDateTimeInterval currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionDateTimeInterval.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionDateTimeIntervalIterator theLibrarianPositionDateTimeIntervalIterator = (LibrarianPositionDateTimeIntervalIterator)findAncestorWithClass(this, LibrarianPositionDateTimeIntervalIterator.class);
			pageContext.getOut().print(theLibrarianPositionDateTimeIntervalIterator.getDateTimeInterval());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

