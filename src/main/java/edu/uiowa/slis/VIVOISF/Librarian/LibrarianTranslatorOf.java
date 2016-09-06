package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianTranslatorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianTranslatorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianTranslatorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianTranslatorOfIterator theLibrarianTranslatorOfIterator = (LibrarianTranslatorOfIterator)findAncestorWithClass(this, LibrarianTranslatorOfIterator.class);
			pageContext.getOut().print(theLibrarianTranslatorOfIterator.getTranslatorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

