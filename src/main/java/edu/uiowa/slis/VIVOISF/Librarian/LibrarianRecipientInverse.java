package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianRecipientInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianRecipientInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianRecipientInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianRecipientInverseIterator theLibrarianRecipientInverseIterator = (LibrarianRecipientInverseIterator)findAncestorWithClass(this, LibrarianRecipientInverseIterator.class);
			pageContext.getOut().print(theLibrarianRecipientInverseIterator.getRecipientInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for recipient tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for recipient tag ");
		}
		return SKIP_BODY;
	}
}

