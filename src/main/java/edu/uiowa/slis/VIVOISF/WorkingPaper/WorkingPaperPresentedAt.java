package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperPresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperPresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperPresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperPresentedAtIterator theWorkingPaperPresentedAtIterator = (WorkingPaperPresentedAtIterator)findAncestorWithClass(this, WorkingPaperPresentedAtIterator.class);
			pageContext.getOut().print(theWorkingPaperPresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

