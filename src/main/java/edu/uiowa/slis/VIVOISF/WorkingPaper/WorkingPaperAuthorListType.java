package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperAuthorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperAuthorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperAuthorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperAuthorListIterator theWorkingPaperAuthorListIterator = (WorkingPaperAuthorListIterator)findAncestorWithClass(this, WorkingPaperAuthorListIterator.class);
			pageContext.getOut().print(theWorkingPaperAuthorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for authorList tag ");
		}
		return SKIP_BODY;
	}
}

