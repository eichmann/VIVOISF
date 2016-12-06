package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionNationalityENIterator theLibrarianPosition = (LibrarianPositionNationalityENIterator)findAncestorWithClass(this, LibrarianPositionNationalityENIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

