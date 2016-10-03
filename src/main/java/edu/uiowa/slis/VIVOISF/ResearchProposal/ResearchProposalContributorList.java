package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalContributorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalContributorList currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalContributorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalContributorListIterator theResearchProposalContributorListIterator = (ResearchProposalContributorListIterator)findAncestorWithClass(this, ResearchProposalContributorListIterator.class);
			pageContext.getOut().print(theResearchProposalContributorListIterator.getContributorList());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

