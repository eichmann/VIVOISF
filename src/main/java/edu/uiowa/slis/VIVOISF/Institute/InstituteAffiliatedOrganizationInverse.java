package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteAffiliatedOrganizationInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteAffiliatedOrganizationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteAffiliatedOrganizationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstituteAffiliatedOrganizationInverseIterator theInstituteAffiliatedOrganizationInverseIterator = (InstituteAffiliatedOrganizationInverseIterator)findAncestorWithClass(this, InstituteAffiliatedOrganizationInverseIterator.class);
			pageContext.getOut().print(theInstituteAffiliatedOrganizationInverseIterator.getAffiliatedOrganizationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

