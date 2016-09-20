package edu.uiowa.slis.VIVOISF.Center;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CenterAffiliatedOrganizationInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CenterAffiliatedOrganizationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(CenterAffiliatedOrganizationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CenterAffiliatedOrganizationInverseIterator theCenterAffiliatedOrganizationInverseIterator = (CenterAffiliatedOrganizationInverseIterator)findAncestorWithClass(this, CenterAffiliatedOrganizationInverseIterator.class);
			pageContext.getOut().print(theCenterAffiliatedOrganizationInverseIterator.getAffiliatedOrganizationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing Center for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

