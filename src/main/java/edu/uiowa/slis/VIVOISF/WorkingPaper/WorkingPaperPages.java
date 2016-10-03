package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperPages currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperPagesIterator theWorkingPaper = (WorkingPaperPagesIterator)findAncestorWithClass(this, WorkingPaperPagesIterator.class);
			pageContext.getOut().print(theWorkingPaper.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for pages tag ");
		}
		return SKIP_BODY;
	}
}
