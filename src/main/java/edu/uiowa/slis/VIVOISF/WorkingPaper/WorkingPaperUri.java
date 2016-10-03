package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperUri currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperUriIterator theWorkingPaper = (WorkingPaperUriIterator)findAncestorWithClass(this, WorkingPaperUriIterator.class);
			pageContext.getOut().print(theWorkingPaper.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for uri tag ");
		}
		return SKIP_BODY;
	}
}

