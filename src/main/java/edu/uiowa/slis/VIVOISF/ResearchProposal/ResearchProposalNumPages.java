package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalNumPagesIterator theResearchProposal = (ResearchProposalNumPagesIterator)findAncestorWithClass(this, ResearchProposalNumPagesIterator.class);
			pageContext.getOut().print(theResearchProposal.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for numPages tag ");
		}
		return SKIP_BODY;
	}
}

