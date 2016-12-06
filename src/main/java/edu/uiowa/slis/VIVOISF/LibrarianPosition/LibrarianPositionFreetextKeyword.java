package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionFreetextKeywordIterator theLibrarianPosition = (LibrarianPositionFreetextKeywordIterator)findAncestorWithClass(this, LibrarianPositionFreetextKeywordIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

