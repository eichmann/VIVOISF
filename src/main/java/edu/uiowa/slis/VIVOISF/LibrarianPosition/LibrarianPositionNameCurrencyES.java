package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionNameCurrencyESIterator theLibrarianPosition = (LibrarianPositionNameCurrencyESIterator)findAncestorWithClass(this, LibrarianPositionNameCurrencyESIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

