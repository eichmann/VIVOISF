package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionNameCurrencyFRIterator theLibrarianPosition = (LibrarianPositionNameCurrencyFRIterator)findAncestorWithClass(this, LibrarianPositionNameCurrencyFRIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

