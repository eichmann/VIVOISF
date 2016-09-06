package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalStatusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalStatusIterator theResearchProposalStatusIterator = (ResearchProposalStatusIterator)findAncestorWithClass(this, ResearchProposalStatusIterator.class);
			pageContext.getOut().print(theResearchProposalStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for status tag ");
		}
		return SKIP_BODY;
	}
}

