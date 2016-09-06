package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperDoiIterator theWorkingPaper = (WorkingPaperDoiIterator)findAncestorWithClass(this, WorkingPaperDoiIterator.class);
			pageContext.getOut().print(theWorkingPaper.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for doi tag ");
		}
		return SKIP_BODY;
	}
}

