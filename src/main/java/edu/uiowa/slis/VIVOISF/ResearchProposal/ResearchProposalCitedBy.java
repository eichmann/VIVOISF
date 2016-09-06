package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalCitedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalCitedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalCitedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalCitedByIterator theResearchProposalCitedByIterator = (ResearchProposalCitedByIterator)findAncestorWithClass(this, ResearchProposalCitedByIterator.class);
			pageContext.getOut().print(theResearchProposalCitedByIterator.getCitedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

