package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibraryRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibraryRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(LibraryRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibraryRelatedByIterator theLibraryRelatedByIterator = (LibraryRelatedByIterator)findAncestorWithClass(this, LibraryRelatedByIterator.class);
			pageContext.getOut().print(theLibraryRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Library for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

