package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalOclcnumIterator theResearchProposal = (ResearchProposalOclcnumIterator)findAncestorWithClass(this, ResearchProposalOclcnumIterator.class);
			pageContext.getOut().print(theResearchProposal.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

