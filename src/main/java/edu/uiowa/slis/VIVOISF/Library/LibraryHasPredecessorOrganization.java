package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibraryHasPredecessorOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibraryHasPredecessorOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(LibraryHasPredecessorOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibraryHasPredecessorOrganizationIterator theLibraryHasPredecessorOrganizationIterator = (LibraryHasPredecessorOrganizationIterator)findAncestorWithClass(this, LibraryHasPredecessorOrganizationIterator.class);
			pageContext.getOut().print(theLibraryHasPredecessorOrganizationIterator.getHasPredecessorOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing Library for hasPredecessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for hasPredecessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

