package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperNumberIterator theWorkingPaper = (WorkingPaperNumberIterator)findAncestorWithClass(this, WorkingPaperNumberIterator.class);
			pageContext.getOut().print(theWorkingPaper.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for number tag ");
		}
		return SKIP_BODY;
	}
}

