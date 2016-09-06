package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibraryOverview extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibraryOverview currentInstance = null;
	private static final Log log = LogFactory.getLog(LibraryOverview.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Library theLibrary = (Library)findAncestorWithClass(this, Library.class);
			if (!theLibrary.commitNeeded) {
				pageContext.getOut().print(theLibrary.getOverview());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Library for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for overview tag ");
		}
		return SKIP_BODY;
	}

	public String getOverview() throws JspTagException {
		try {
			Library theLibrary = (Library)findAncestorWithClass(this, Library.class);
			return theLibrary.getOverview();
		} catch (Exception e) {
			log.error(" Can't find enclosing Library for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for overview tag ");
		}
	}

	public void setOverview(String overview) throws JspTagException {
		try {
			Library theLibrary = (Library)findAncestorWithClass(this, Library.class);
			theLibrary.setOverview(overview);
		} catch (Exception e) {
			log.error("Can't find enclosing Library for overview tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for overview tag ");
		}
	}
}

