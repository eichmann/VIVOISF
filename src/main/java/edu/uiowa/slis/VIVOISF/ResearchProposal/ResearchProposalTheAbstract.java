package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalTheAbstractIterator theResearchProposal = (ResearchProposalTheAbstractIterator)findAncestorWithClass(this, ResearchProposalTheAbstractIterator.class);
			pageContext.getOut().print(theResearchProposal.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

