package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalShortTitleIterator theResearchProposal = (ResearchProposalShortTitleIterator)findAncestorWithClass(this, ResearchProposalShortTitleIterator.class);
			pageContext.getOut().print(theResearchProposal.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

