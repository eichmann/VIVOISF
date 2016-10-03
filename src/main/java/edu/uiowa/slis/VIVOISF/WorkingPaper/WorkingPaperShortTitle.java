package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperShortTitleIterator theWorkingPaper = (WorkingPaperShortTitleIterator)findAncestorWithClass(this, WorkingPaperShortTitleIterator.class);
			pageContext.getOut().print(theWorkingPaper.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

