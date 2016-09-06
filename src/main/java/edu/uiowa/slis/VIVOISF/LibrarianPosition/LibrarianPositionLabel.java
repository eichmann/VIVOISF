package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPosition theLibrarianPosition = (LibrarianPosition)findAncestorWithClass(this, LibrarianPosition.class);
			if (!theLibrarianPosition.commitNeeded) {
				pageContext.getOut().print(theLibrarianPosition.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			LibrarianPosition theLibrarianPosition = (LibrarianPosition)findAncestorWithClass(this, LibrarianPosition.class);
			return theLibrarianPosition.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing LibrarianPosition for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			LibrarianPosition theLibrarianPosition = (LibrarianPosition)findAncestorWithClass(this, LibrarianPosition.class);
			theLibrarianPosition.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for label tag ");
		}
	}
}

