package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalVolumeIterator theResearchProposal = (ResearchProposalVolumeIterator)findAncestorWithClass(this, ResearchProposalVolumeIterator.class);
			pageContext.getOut().print(theResearchProposal.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for volume tag ");
		}
		return SKIP_BODY;
	}
}

