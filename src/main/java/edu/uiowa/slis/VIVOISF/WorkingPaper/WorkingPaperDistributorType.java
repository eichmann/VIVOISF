package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperDistributorIterator theWorkingPaperDistributorIterator = (WorkingPaperDistributorIterator)findAncestorWithClass(this, WorkingPaperDistributorIterator.class);
			pageContext.getOut().print(theWorkingPaperDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for distributor tag ");
		}
		return SKIP_BODY;
	}
}

