package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalInformationResourceSupportedByIterator theResearchProposalInformationResourceSupportedByIterator = (ResearchProposalInformationResourceSupportedByIterator)findAncestorWithClass(this, ResearchProposalInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theResearchProposalInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

