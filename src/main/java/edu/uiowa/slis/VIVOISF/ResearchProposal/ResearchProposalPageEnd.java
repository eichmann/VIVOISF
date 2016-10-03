package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalPageEndIterator theResearchProposal = (ResearchProposalPageEndIterator)findAncestorWithClass(this, ResearchProposalPageEndIterator.class);
			pageContext.getOut().print(theResearchProposal.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

