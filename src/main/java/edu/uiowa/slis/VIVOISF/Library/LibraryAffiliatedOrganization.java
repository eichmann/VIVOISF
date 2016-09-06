package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibraryAffiliatedOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibraryAffiliatedOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(LibraryAffiliatedOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibraryAffiliatedOrganizationIterator theLibraryAffiliatedOrganizationIterator = (LibraryAffiliatedOrganizationIterator)findAncestorWithClass(this, LibraryAffiliatedOrganizationIterator.class);
			pageContext.getOut().print(theLibraryAffiliatedOrganizationIterator.getAffiliatedOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing Library for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

