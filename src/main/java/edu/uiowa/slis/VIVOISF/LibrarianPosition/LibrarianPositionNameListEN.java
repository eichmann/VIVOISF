package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionNameListENIterator theLibrarianPosition = (LibrarianPositionNameListENIterator)findAncestorWithClass(this, LibrarianPositionNameListENIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

