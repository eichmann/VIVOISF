package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalPages currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalPagesIterator theResearchProposal = (ResearchProposalPagesIterator)findAncestorWithClass(this, ResearchProposalPagesIterator.class);
			pageContext.getOut().print(theResearchProposal.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for pages tag ");
		}
		return SKIP_BODY;
	}
}

