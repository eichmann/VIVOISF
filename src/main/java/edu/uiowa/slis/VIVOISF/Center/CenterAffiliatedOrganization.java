package edu.uiowa.slis.VIVOISF.Center;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CenterAffiliatedOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CenterAffiliatedOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(CenterAffiliatedOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CenterAffiliatedOrganizationIterator theCenterAffiliatedOrganizationIterator = (CenterAffiliatedOrganizationIterator)findAncestorWithClass(this, CenterAffiliatedOrganizationIterator.class);
			pageContext.getOut().print(theCenterAffiliatedOrganizationIterator.getAffiliatedOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing Center for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

