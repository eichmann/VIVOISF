package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibraryRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibraryRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(LibraryRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibraryRelatedByIterator theLibraryRelatedByIterator = (LibraryRelatedByIterator)findAncestorWithClass(this, LibraryRelatedByIterator.class);
			pageContext.getOut().print(theLibraryRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Library for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

