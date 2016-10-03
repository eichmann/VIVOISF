package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalIssuerIterator theResearchProposalIssuerIterator = (ResearchProposalIssuerIterator)findAncestorWithClass(this, ResearchProposalIssuerIterator.class);
			pageContext.getOut().print(theResearchProposalIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for issuer tag ");
		}
		return SKIP_BODY;
	}
}

