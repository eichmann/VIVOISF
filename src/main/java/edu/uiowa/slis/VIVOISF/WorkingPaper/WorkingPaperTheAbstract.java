package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperTheAbstractIterator theWorkingPaper = (WorkingPaperTheAbstractIterator)findAncestorWithClass(this, WorkingPaperTheAbstractIterator.class);
			pageContext.getOut().print(theWorkingPaper.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

