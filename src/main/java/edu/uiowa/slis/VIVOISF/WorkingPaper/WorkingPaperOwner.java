package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperOwnerIterator theWorkingPaperOwnerIterator = (WorkingPaperOwnerIterator)findAncestorWithClass(this, WorkingPaperOwnerIterator.class);
			pageContext.getOut().print(theWorkingPaperOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for owner tag ");
		}
		return SKIP_BODY;
	}
}

