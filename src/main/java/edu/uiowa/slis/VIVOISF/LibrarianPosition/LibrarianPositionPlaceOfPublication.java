package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionPlaceOfPublication extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionPlaceOfPublication currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionPlaceOfPublication.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPosition theLibrarianPosition = (LibrarianPosition)findAncestorWithClass(this, LibrarianPosition.class);
			if (!theLibrarianPosition.commitNeeded) {
				pageContext.getOut().print(theLibrarianPosition.getPlaceOfPublication());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for placeOfPublication tag ");
		}
		return SKIP_BODY;
	}

	public String getPlaceOfPublication() throws JspTagException {
		try {
			LibrarianPosition theLibrarianPosition = (LibrarianPosition)findAncestorWithClass(this, LibrarianPosition.class);
			return theLibrarianPosition.getPlaceOfPublication();
		} catch (Exception e) {
			log.error(" Can't find enclosing LibrarianPosition for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for placeOfPublication tag ");
		}
	}

	public void setPlaceOfPublication(String placeOfPublication) throws JspTagException {
		try {
			LibrarianPosition theLibrarianPosition = (LibrarianPosition)findAncestorWithClass(this, LibrarianPosition.class);
			theLibrarianPosition.setPlaceOfPublication(placeOfPublication);
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for placeOfPublication tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for placeOfPublication tag ");
		}
	}
}

