package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalLccnIterator theResearchProposal = (ResearchProposalLccnIterator)findAncestorWithClass(this, ResearchProposalLccnIterator.class);
			pageContext.getOut().print(theResearchProposal.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for lccn tag ");
		}
		return SKIP_BODY;
	}
}

