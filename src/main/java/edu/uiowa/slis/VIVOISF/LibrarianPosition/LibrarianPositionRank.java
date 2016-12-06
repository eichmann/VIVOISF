package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionRank extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionRank currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionRank.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionRankIterator theLibrarianPosition = (LibrarianPositionRankIterator)findAncestorWithClass(this, LibrarianPositionRankIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getRank());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for rank tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for rank tag ");
		}
		return SKIP_BODY;
	}
}

