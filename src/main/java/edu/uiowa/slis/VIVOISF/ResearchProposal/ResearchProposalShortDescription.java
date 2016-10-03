package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalShortDescriptionIterator theResearchProposal = (ResearchProposalShortDescriptionIterator)findAncestorWithClass(this, ResearchProposalShortDescriptionIterator.class);
			pageContext.getOut().print(theResearchProposal.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

