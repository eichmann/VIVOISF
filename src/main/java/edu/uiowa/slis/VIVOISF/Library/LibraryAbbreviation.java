package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibraryAbbreviation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibraryAbbreviation currentInstance = null;
	private static final Log log = LogFactory.getLog(LibraryAbbreviation.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Library theLibrary = (Library)findAncestorWithClass(this, Library.class);
			if (!theLibrary.commitNeeded) {
				pageContext.getOut().print(theLibrary.getAbbreviation());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Library for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for abbreviation tag ");
		}
		return SKIP_BODY;
	}

	public String getAbbreviation() throws JspTagException {
		try {
			Library theLibrary = (Library)findAncestorWithClass(this, Library.class);
			return theLibrary.getAbbreviation();
		} catch (Exception e) {
			log.error(" Can't find enclosing Library for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for abbreviation tag ");
		}
	}

	public void setAbbreviation(String abbreviation) throws JspTagException {
		try {
			Library theLibrary = (Library)findAncestorWithClass(this, Library.class);
			theLibrary.setAbbreviation(abbreviation);
		} catch (Exception e) {
			log.error("Can't find enclosing Library for abbreviation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for abbreviation tag ");
		}
	}
}

