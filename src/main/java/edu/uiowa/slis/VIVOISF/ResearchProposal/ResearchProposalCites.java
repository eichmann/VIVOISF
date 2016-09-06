package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalCites extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalCites currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalCites.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalCitesIterator theResearchProposalCitesIterator = (ResearchProposalCitesIterator)findAncestorWithClass(this, ResearchProposalCitesIterator.class);
			pageContext.getOut().print(theResearchProposalCitesIterator.getCites());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for cites tag ");
		}
		return SKIP_BODY;
	}
}

