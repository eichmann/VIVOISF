package edu.uiowa.slis.VIVOISF.Librarian;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianProducerInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianProducerInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianProducerInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianProducerInverseIterator theLibrarianProducerInverseIterator = (LibrarianProducerInverseIterator)findAncestorWithClass(this, LibrarianProducerInverseIterator.class);
			pageContext.getOut().print(theLibrarianProducerInverseIterator.getProducerInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Librarian for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Librarian for producer tag ");
		}
		return SKIP_BODY;
	}
}
