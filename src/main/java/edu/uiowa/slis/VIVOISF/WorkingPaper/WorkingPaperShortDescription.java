package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperShortDescriptionIterator theWorkingPaper = (WorkingPaperShortDescriptionIterator)findAncestorWithClass(this, WorkingPaperShortDescriptionIterator.class);
			pageContext.getOut().print(theWorkingPaper.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

