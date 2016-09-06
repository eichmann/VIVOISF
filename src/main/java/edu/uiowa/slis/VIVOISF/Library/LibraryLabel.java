package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibraryLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibraryLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(LibraryLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Library theLibrary = (Library)findAncestorWithClass(this, Library.class);
			if (!theLibrary.commitNeeded) {
				pageContext.getOut().print(theLibrary.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Library for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			Library theLibrary = (Library)findAncestorWithClass(this, Library.class);
			return theLibrary.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing Library for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			Library theLibrary = (Library)findAncestorWithClass(this, Library.class);
			theLibrary.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing Library for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for label tag ");
		}
	}
}

