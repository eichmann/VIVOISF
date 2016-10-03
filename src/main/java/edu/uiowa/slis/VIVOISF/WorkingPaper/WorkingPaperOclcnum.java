package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperOclcnumIterator theWorkingPaper = (WorkingPaperOclcnumIterator)findAncestorWithClass(this, WorkingPaperOclcnumIterator.class);
			pageContext.getOut().print(theWorkingPaper.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

