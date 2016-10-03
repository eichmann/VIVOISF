package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperEditionIterator theWorkingPaper = (WorkingPaperEditionIterator)findAncestorWithClass(this, WorkingPaperEditionIterator.class);
			pageContext.getOut().print(theWorkingPaper.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for edition tag ");
		}
		return SKIP_BODY;
	}
}

