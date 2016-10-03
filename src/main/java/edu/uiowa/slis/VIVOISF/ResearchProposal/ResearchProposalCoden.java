package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalCodenIterator theResearchProposal = (ResearchProposalCodenIterator)findAncestorWithClass(this, ResearchProposalCodenIterator.class);
			pageContext.getOut().print(theResearchProposal.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for coden tag ");
		}
		return SKIP_BODY;
	}
}

