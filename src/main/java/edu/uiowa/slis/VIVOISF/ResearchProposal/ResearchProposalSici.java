package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalSici currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalSiciIterator theResearchProposal = (ResearchProposalSiciIterator)findAncestorWithClass(this, ResearchProposalSiciIterator.class);
			pageContext.getOut().print(theResearchProposal.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for sici tag ");
		}
		return SKIP_BODY;
	}
}

