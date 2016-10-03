package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalIdentifierIterator theResearchProposal = (ResearchProposalIdentifierIterator)findAncestorWithClass(this, ResearchProposalIdentifierIterator.class);
			pageContext.getOut().print(theResearchProposal.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for identifier tag ");
		}
		return SKIP_BODY;
	}
}

