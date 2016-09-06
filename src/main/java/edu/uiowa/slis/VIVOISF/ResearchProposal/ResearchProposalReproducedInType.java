package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalReproducedInType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalReproducedInType currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalReproducedInType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalReproducedInIterator theResearchProposalReproducedInIterator = (ResearchProposalReproducedInIterator)findAncestorWithClass(this, ResearchProposalReproducedInIterator.class);
			pageContext.getOut().print(theResearchProposalReproducedInIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

