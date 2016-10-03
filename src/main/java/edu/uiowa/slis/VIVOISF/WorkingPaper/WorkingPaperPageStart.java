package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperPageStartIterator theWorkingPaper = (WorkingPaperPageStartIterator)findAncestorWithClass(this, WorkingPaperPageStartIterator.class);
			pageContext.getOut().print(theWorkingPaper.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

