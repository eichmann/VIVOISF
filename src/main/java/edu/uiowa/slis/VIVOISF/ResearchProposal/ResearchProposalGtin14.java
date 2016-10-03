package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalGtin14Iterator theResearchProposal = (ResearchProposalGtin14Iterator)findAncestorWithClass(this, ResearchProposalGtin14Iterator.class);
			pageContext.getOut().print(theResearchProposal.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

