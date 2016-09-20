package edu.uiowa.slis.VIVOISF.Library;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LibraryAffiliatedOrganizationInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LibraryAffiliatedOrganizationInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(LibraryAffiliatedOrganizationInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LibraryAffiliatedOrganizationInverseIterator theLibraryAffiliatedOrganizationInverseIterator = (LibraryAffiliatedOrganizationInverseIterator)findAncestorWithClass(this, LibraryAffiliatedOrganizationInverseIterator.class);
			pageContext.getOut().print(theLibraryAffiliatedOrganizationInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Library for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Library for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

