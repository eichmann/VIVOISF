package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperHandleIterator theWorkingPaper = (WorkingPaperHandleIterator)findAncestorWithClass(this, WorkingPaperHandleIterator.class);
			pageContext.getOut().print(theWorkingPaper.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for handle tag ");
		}
		return SKIP_BODY;
	}
}

