package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperUpcIterator theWorkingPaper = (WorkingPaperUpcIterator)findAncestorWithClass(this, WorkingPaperUpcIterator.class);
			pageContext.getOut().print(theWorkingPaper.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for upc tag ");
		}
		return SKIP_BODY;
	}
}

