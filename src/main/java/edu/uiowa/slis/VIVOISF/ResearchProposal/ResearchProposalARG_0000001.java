package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalARG_0000001Iterator theResearchProposal = (ResearchProposalARG_0000001Iterator)findAncestorWithClass(this, ResearchProposalARG_0000001Iterator.class);
			pageContext.getOut().print(theResearchProposal.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

