package edu.uiowa.slis.VIVOISF.ResearchOrganization;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchOrganizationSubcontractsGrantType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchOrganizationSubcontractsGrantType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchOrganizationSubcontractsGrantType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchOrganizationSubcontractsGrantIterator theResearchOrganizationSubcontractsGrantIterator = (ResearchOrganizationSubcontractsGrantIterator)findAncestorWithClass(this, ResearchOrganizationSubcontractsGrantIterator.class);
			pageContext.getOut().print(theResearchOrganizationSubcontractsGrantIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchOrganization for subcontractsGrant tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchOrganization for subcontractsGrant tag ");
		}
		return SKIP_BODY;
	}
}

