package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionGDPTotalInCurrentPricesIterator theLibrarianPosition = (LibrarianPositionGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, LibrarianPositionGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

