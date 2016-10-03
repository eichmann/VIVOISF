package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperContributorListIterator theWorkingPaperContributorListIterator = (WorkingPaperContributorListIterator)findAncestorWithClass(this, WorkingPaperContributorListIterator.class);
			pageContext.getOut().print(theWorkingPaperContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

