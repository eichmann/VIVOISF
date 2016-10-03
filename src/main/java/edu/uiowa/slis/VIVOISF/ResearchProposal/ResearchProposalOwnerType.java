package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalOwnerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalOwnerType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalOwnerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalOwnerIterator theResearchProposalOwnerIterator = (ResearchProposalOwnerIterator)findAncestorWithClass(this, ResearchProposalOwnerIterator.class);
			pageContext.getOut().print(theResearchProposalOwnerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for owner tag ");
		}
		return SKIP_BODY;
	}
}

