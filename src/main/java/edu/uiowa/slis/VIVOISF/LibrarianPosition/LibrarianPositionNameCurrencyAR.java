package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionNameCurrencyARIterator theLibrarianPosition = (LibrarianPositionNameCurrencyARIterator)findAncestorWithClass(this, LibrarianPositionNameCurrencyARIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

