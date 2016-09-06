package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianTranslatorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianTranslatorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianTranslatorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianTranslatorOfIterator theLibrarianTranslatorOfIterator = (LibrarianTranslatorOfIterator)findAncestorWithClass(this, LibrarianTranslatorOfIterator.class);
			pageContext.getOut().print(theLibrarianTranslatorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for translatorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for translatorOf tag ");
		}
		return SKIP_BODY;
	}
}

