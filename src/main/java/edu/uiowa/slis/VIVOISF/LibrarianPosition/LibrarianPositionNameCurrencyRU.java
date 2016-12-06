package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionNameCurrencyRUIterator theLibrarianPosition = (LibrarianPositionNameCurrencyRUIterator)findAncestorWithClass(this, LibrarianPositionNameCurrencyRUIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

