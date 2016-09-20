package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationAffiliatedOrganizationInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationAffiliatedOrganizationInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationAffiliatedOrganizationInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationAffiliatedOrganizationInverseIterator theResearchOrganizationAffiliatedOrganizationInverseIterator = (ResearchOrganizationAffiliatedOrganizationInverseIterator)findAncestorWithClass(this, ResearchOrganizationAffiliatedOrganizationInverseIterator.class);
			pageContext.getOut().print(theResearchOrganizationAffiliatedOrganizationInverseIterator.getAffiliatedOrganizationInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

