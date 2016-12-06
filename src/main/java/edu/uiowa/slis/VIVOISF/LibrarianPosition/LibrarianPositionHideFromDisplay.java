package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionHideFromDisplay extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionHideFromDisplay currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionHideFromDisplay.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPosition theLibrarianPosition = (LibrarianPosition)findAncestorWithClass(this, LibrarianPosition.class);
			if (!theLibrarianPosition.commitNeeded) {
				pageContext.getOut().print(theLibrarianPosition.getHideFromDisplay());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for hideFromDisplay tag ");
		}
		return SKIP_BODY;
	}

	public String getHideFromDisplay() throws JspTagException {
		try {
			LibrarianPosition theLibrarianPosition = (LibrarianPosition)findAncestorWithClass(this, LibrarianPosition.class);
			return theLibrarianPosition.getHideFromDisplay();
		} catch (Exception e) {
			log.error(" Can't find enclosing LibrarianPosition for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for hideFromDisplay tag ");
		}
	}

	public void setHideFromDisplay(String hideFromDisplay) throws JspTagException {
		try {
			LibrarianPosition theLibrarianPosition = (LibrarianPosition)findAncestorWithClass(this, LibrarianPosition.class);
			theLibrarianPosition.setHideFromDisplay(hideFromDisplay);
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for hideFromDisplay tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for hideFromDisplay tag ");
		}
	}
}

