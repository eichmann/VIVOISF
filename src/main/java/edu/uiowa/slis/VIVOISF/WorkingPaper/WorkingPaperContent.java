package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperContent currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperContentIterator theWorkingPaper = (WorkingPaperContentIterator)findAncestorWithClass(this, WorkingPaperContentIterator.class);
			pageContext.getOut().print(theWorkingPaper.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for content tag ");
		}
		return SKIP_BODY;
	}
}

