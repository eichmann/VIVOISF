package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalLocatorIterator theResearchProposal = (ResearchProposalLocatorIterator)findAncestorWithClass(this, ResearchProposalLocatorIterator.class);
			pageContext.getOut().print(theResearchProposal.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for locator tag ");
		}
		return SKIP_BODY;
	}
}

