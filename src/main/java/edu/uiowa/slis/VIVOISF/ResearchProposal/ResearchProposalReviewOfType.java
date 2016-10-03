package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalReviewOfIterator theResearchProposalReviewOfIterator = (ResearchProposalReviewOfIterator)findAncestorWithClass(this, ResearchProposalReviewOfIterator.class);
			pageContext.getOut().print(theResearchProposalReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

