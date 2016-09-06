package edu.uiowa.slis.VIVOISF.Institute;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InstituteAffiliatedOrganizationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InstituteAffiliatedOrganizationType currentInstance = null;
	private static final Log log = LogFactory.getLog(InstituteAffiliatedOrganizationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			InstituteAffiliatedOrganizationIterator theInstituteAffiliatedOrganizationIterator = (InstituteAffiliatedOrganizationIterator)findAncestorWithClass(this, InstituteAffiliatedOrganizationIterator.class);
			pageContext.getOut().print(theInstituteAffiliatedOrganizationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Institute for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Institute for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

