package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalAsinIterator theResearchProposal = (ResearchProposalAsinIterator)findAncestorWithClass(this, ResearchProposalAsinIterator.class);
			pageContext.getOut().print(theResearchProposal.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for asin tag ");
		}
		return SKIP_BODY;
	}
}

