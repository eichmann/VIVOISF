package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalIAO_0000136Iterator theResearchProposalIAO_0000136Iterator = (ResearchProposalIAO_0000136Iterator)findAncestorWithClass(this, ResearchProposalIAO_0000136Iterator.class);
			pageContext.getOut().print(theResearchProposalIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

