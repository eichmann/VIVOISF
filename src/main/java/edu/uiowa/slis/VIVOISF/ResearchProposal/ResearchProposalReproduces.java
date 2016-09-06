package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalReproduces extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalReproduces currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalReproduces.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalReproducesIterator theResearchProposalReproducesIterator = (ResearchProposalReproducesIterator)findAncestorWithClass(this, ResearchProposalReproducesIterator.class);
			pageContext.getOut().print(theResearchProposalReproducesIterator.getReproduces());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

