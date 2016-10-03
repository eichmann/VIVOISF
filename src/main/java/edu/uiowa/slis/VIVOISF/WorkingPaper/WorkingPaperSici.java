package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperSici currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperSiciIterator theWorkingPaper = (WorkingPaperSiciIterator)findAncestorWithClass(this, WorkingPaperSiciIterator.class);
			pageContext.getOut().print(theWorkingPaper.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for sici tag ");
		}
		return SKIP_BODY;
	}
}

