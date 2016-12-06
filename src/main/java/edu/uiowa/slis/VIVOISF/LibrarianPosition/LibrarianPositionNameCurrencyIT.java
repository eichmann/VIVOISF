package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionNameCurrencyITIterator theLibrarianPosition = (LibrarianPositionNameCurrencyITIterator)findAncestorWithClass(this, LibrarianPositionNameCurrencyITIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

