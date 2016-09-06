package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationAffiliatedOrganization extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationAffiliatedOrganization currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationAffiliatedOrganization.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationAffiliatedOrganizationIterator theResearchOrganizationAffiliatedOrganizationIterator = (ResearchOrganizationAffiliatedOrganizationIterator)findAncestorWithClass(this, ResearchOrganizationAffiliatedOrganizationIterator.class);
			pageContext.getOut().print(theResearchOrganizationAffiliatedOrganizationIterator.getAffiliatedOrganization());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for affiliatedOrganization tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for affiliatedOrganization tag ");
		}
		return SKIP_BODY;
	}
}

