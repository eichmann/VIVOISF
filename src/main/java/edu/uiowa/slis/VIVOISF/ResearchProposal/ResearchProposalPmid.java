package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalPmidIterator theResearchProposal = (ResearchProposalPmidIterator)findAncestorWithClass(this, ResearchProposalPmidIterator.class);
			pageContext.getOut().print(theResearchProposal.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for pmid tag ");
		}
		return SKIP_BODY;
	}
}

