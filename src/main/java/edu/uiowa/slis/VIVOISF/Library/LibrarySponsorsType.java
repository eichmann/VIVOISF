package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibrarySponsorsType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibrarySponsorsType currentInstance = null;
	private static final Log log = LogFactory.getLog(LibrarySponsorsType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibrarySponsorsIterator theLibrarySponsorsIterator = (LibrarySponsorsIterator)findAncestorWithClass(this, LibrarySponsorsIterator.class);
			pageContext.getOut().print(theLibrarySponsorsIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Library for sponsors tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for sponsors tag ");
		}
		return SKIP_BODY;
	}
}

