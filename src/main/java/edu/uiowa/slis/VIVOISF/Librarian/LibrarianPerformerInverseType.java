package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPerformerInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPerformerInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPerformerInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianPerformerInverseIterator theLibrarianPerformerInverseIterator = (LibrarianPerformerInverseIterator)findAncestorWithClass(this, LibrarianPerformerInverseIterator.class);
			pageContext.getOut().print(theLibrarianPerformerInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for performer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for performer tag ");
		}
		return SKIP_BODY;
	}
}

