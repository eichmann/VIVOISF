package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionNameCurrencyENIterator theLibrarianPosition = (LibrarianPositionNameCurrencyENIterator)findAncestorWithClass(this, LibrarianPositionNameCurrencyENIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

