package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalPageStartIterator theResearchProposal = (ResearchProposalPageStartIterator)findAncestorWithClass(this, ResearchProposalPageStartIterator.class);
			pageContext.getOut().print(theResearchProposal.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

