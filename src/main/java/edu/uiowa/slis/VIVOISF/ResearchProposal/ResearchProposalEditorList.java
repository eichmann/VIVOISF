package edu.uiowa.slis.VIVOISF.ResearchProposal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResearchProposalEditorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ResearchProposalEditorList currentInstance = null;
	private static final Log log = LogFactory.getLog(ResearchProposalEditorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ResearchProposalEditorListIterator theResearchProposalEditorListIterator = (ResearchProposalEditorListIterator)findAncestorWithClass(this, ResearchProposalEditorListIterator.class);
			pageContext.getOut().print(theResearchProposalEditorListIterator.getEditorList());
		} catch (Exception e) {
			log.error("Can't find enclosing ResearchProposal for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing ResearchProposal for editorList tag ");
		}
		return SKIP_BODY;
	}
}

