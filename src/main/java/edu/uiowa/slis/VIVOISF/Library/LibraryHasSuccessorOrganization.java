package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibraryHasSuccessorOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibraryHasSuccessorOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(LibraryHasSuccessorOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibraryHasSuccessorOrganizationIterator theLibraryHasSuccessorOrganizationIterator = (LibraryHasSuccessorOrganizationIterator)findAncestorWithClass(this, LibraryHasSuccessorOrganizationIterator.class);
			pageContext.getOut().print(theLibraryHasSuccessorOrganizationIterator.getHasSuccessorOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing Library for hasSuccessorOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for hasSuccessorOrganization tag ");
		}
		return SKIP_BODY;
	}
}

