package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperAsinIterator theWorkingPaper = (WorkingPaperAsinIterator)findAncestorWithClass(this, WorkingPaperAsinIterator.class);
			pageContext.getOut().print(theWorkingPaper.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for asin tag ");
		}
		return SKIP_BODY;
	}
}

