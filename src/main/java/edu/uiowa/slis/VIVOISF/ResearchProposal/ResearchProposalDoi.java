package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalDoiIterator theResearchProposal = (ResearchProposalDoiIterator)findAncestorWithClass(this, ResearchProposalDoiIterator.class);
			pageContext.getOut().print(theResearchProposal.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for doi tag ");
		}
		return SKIP_BODY;
	}
}

