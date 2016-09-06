package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperStatusType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperStatusType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperStatusType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperStatusIterator theWorkingPaperStatusIterator = (WorkingPaperStatusIterator)findAncestorWithClass(this, WorkingPaperStatusIterator.class);
			pageContext.getOut().print(theWorkingPaperStatusIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for status tag ");
		}
		return SKIP_BODY;
	}
}

