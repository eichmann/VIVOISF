package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalIsbn13Iterator theResearchProposal = (ResearchProposalIsbn13Iterator)findAncestorWithClass(this, ResearchProposalIsbn13Iterator.class);
			pageContext.getOut().print(theResearchProposal.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

