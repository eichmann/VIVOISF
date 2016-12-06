package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionCodeDBPediaID extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionCodeDBPediaID currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionCodeDBPediaID.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPositionCodeDBPediaIDIterator theLibrarianPosition = (LibrarianPositionCodeDBPediaIDIterator)findAncestorWithClass(this, LibrarianPositionCodeDBPediaIDIterator.class);
			pageContext.getOut().print(theLibrarianPosition.getCodeDBPediaID());
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for codeDBPediaID tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for codeDBPediaID tag ");
		}
		return SKIP_BODY;
	}
}

