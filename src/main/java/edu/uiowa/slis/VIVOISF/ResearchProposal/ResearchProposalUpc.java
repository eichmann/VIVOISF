package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalUpcIterator theResearchProposal = (ResearchProposalUpcIterator)findAncestorWithClass(this, ResearchProposalUpcIterator.class);
			pageContext.getOut().print(theResearchProposal.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for upc tag ");
		}
		return SKIP_BODY;
	}
}

