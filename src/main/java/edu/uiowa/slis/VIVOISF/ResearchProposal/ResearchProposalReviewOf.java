package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalReviewOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalReviewOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalReviewOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalReviewOfIterator theResearchProposalReviewOfIterator = (ResearchProposalReviewOfIterator)findAncestorWithClass(this, ResearchProposalReviewOfIterator.class);
			pageContext.getOut().print(theResearchProposalReviewOfIterator.getReviewOf());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

