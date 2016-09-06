package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperCites extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperCites currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperCites.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperCitesIterator theWorkingPaperCitesIterator = (WorkingPaperCitesIterator)findAncestorWithClass(this, WorkingPaperCitesIterator.class);
			pageContext.getOut().print(theWorkingPaperCitesIterator.getCites());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for cites tag ");
		}
		return SKIP_BODY;
	}
}

