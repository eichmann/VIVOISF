package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionCodeCurrencyIterator theLibrarianPosition = (LibrarianPositionCodeCurrencyIterator)findAncestorWithClass(this, LibrarianPositionCodeCurrencyIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

