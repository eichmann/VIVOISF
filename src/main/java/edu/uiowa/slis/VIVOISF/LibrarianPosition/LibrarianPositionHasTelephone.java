package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionHasTelephone extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionHasTelephone currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionHasTelephone.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionHasTelephoneIterator theLibrarianPositionHasTelephoneIterator = (LibrarianPositionHasTelephoneIterator)findAncestorWithClass(this, LibrarianPositionHasTelephoneIterator.class);
			pageContext.getOut().print(theLibrarianPositionHasTelephoneIterator.getHasTelephone());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

