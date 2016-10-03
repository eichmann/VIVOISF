package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperLocatorIterator theWorkingPaper = (WorkingPaperLocatorIterator)findAncestorWithClass(this, WorkingPaperLocatorIterator.class);
			pageContext.getOut().print(theWorkingPaper.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for locator tag ");
		}
		return SKIP_BODY;
	}
}

