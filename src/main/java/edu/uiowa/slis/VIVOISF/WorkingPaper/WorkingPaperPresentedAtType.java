package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperPresentedAtType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperPresentedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperPresentedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperPresentedAtIterator theWorkingPaperPresentedAtIterator = (WorkingPaperPresentedAtIterator)findAncestorWithClass(this, WorkingPaperPresentedAtIterator.class);
			pageContext.getOut().print(theWorkingPaperPresentedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

