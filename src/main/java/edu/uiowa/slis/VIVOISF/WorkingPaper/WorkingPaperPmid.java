package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperPmidIterator theWorkingPaper = (WorkingPaperPmidIterator)findAncestorWithClass(this, WorkingPaperPmidIterator.class);
			pageContext.getOut().print(theWorkingPaper.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for pmid tag ");
		}
		return SKIP_BODY;
	}
}

