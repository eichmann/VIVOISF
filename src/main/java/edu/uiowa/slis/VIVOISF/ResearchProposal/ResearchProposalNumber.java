package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalNumberIterator theResearchProposal = (ResearchProposalNumberIterator)findAncestorWithClass(this, ResearchProposalNumberIterator.class);
			pageContext.getOut().print(theResearchProposal.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for number tag ");
		}
		return SKIP_BODY;
	}
}

