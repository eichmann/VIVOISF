package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalHandleIterator theResearchProposal = (ResearchProposalHandleIterator)findAncestorWithClass(this, ResearchProposalHandleIterator.class);
			pageContext.getOut().print(theResearchProposal.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for handle tag ");
		}
		return SKIP_BODY;
	}
}

