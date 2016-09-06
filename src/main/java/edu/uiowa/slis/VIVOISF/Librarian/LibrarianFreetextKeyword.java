package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianFreetextKeyword extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianFreetextKeyword currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianFreetextKeyword.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianFreetextKeywordIterator theLibrarian = (LibrarianFreetextKeywordIterator)findAncestorWithClass(this, LibrarianFreetextKeywordIterator.class);
			pageContext.getOut().print(theLibrarian.getFreetextKeyword());
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for freetextKeyword tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for freetextKeyword tag ");
		}
		return SKIP_BODY;
	}
}

