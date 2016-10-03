package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalDistributorIterator theResearchProposalDistributorIterator = (ResearchProposalDistributorIterator)findAncestorWithClass(this, ResearchProposalDistributorIterator.class);
			pageContext.getOut().print(theResearchProposalDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for distributor tag ");
		}
		return SKIP_BODY;
	}
}

