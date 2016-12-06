package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionNameOfficialEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionNameOfficialEN currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionNameOfficialEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionNameOfficialENIterator theLibrarianPosition = (LibrarianPositionNameOfficialENIterator)findAncestorWithClass(this, LibrarianPositionNameOfficialENIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getNameOfficialEN());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for nameOfficialEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for nameOfficialEN tag ");
		}
		return SKIP_BODY;
	}
}

