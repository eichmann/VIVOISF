package edu.uiowa.slis.VIVOISF.LibrarianPosition;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarianPositionAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarianPositionAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarianPositionAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			LibrarianPosition theLibrarianPosition = (LibrarianPosition)findAncestorWithClass(this, LibrarianPosition.class);
			if (!theLibrarianPosition.commitNeeded) {
				pageContext.getOut().print(theLibrarianPosition.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			LibrarianPosition theLibrarianPosition = (LibrarianPosition)findAncestorWithClass(this, LibrarianPosition.class);
			return theLibrarianPosition.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing LibrarianPosition for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			LibrarianPosition theLibrarianPosition = (LibrarianPosition)findAncestorWithClass(this, LibrarianPosition.class);
			theLibrarianPosition.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing LibrarianPosition for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing LibrarianPosition for abbreviation tag ");
		}
	}
}

