package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalRO_0000056Iterator theResearchProposalRO_0000056Iterator = (ResearchProposalRO_0000056Iterator)findAncestorWithClass(this, ResearchProposalRO_0000056Iterator.class);
			pageContext.getOut().print(theResearchProposalRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

