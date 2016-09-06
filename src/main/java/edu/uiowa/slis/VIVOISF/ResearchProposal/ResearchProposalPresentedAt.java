package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalPresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalPresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalPresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalPresentedAtIterator theResearchProposalPresentedAtIterator = (ResearchProposalPresentedAtIterator)findAncestorWithClass(this, ResearchProposalPresentedAtIterator.class);
			pageContext.getOut().print(theResearchProposalPresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

