package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalEditionIterator theResearchProposal = (ResearchProposalEditionIterator)findAncestorWithClass(this, ResearchProposalEditionIterator.class);
			pageContext.getOut().print(theResearchProposal.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for edition tag ");
		}
		return SKIP_BODY;
	}
}

