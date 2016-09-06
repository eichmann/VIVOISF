package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperCitedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperCitedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperCitedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperCitedByIterator theWorkingPaperCitedByIterator = (WorkingPaperCitedByIterator)findAncestorWithClass(this, WorkingPaperCitedByIterator.class);
			pageContext.getOut().print(theWorkingPaperCitedByIterator.getCitedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

