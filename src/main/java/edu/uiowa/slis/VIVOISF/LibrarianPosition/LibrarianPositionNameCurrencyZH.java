package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionNameCurrencyZHIterator theLibrarianPosition = (LibrarianPositionNameCurrencyZHIterator)findAncestorWithClass(this, LibrarianPositionNameCurrencyZHIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

