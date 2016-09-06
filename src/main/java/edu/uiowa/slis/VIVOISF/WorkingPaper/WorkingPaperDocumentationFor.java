package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperDocumentationFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperDocumentationFor currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperDocumentationFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperDocumentationForIterator theWorkingPaperDocumentationForIterator = (WorkingPaperDocumentationForIterator)findAncestorWithClass(this, WorkingPaperDocumentationForIterator.class);
			pageContext.getOut().print(theWorkingPaperDocumentationForIterator.getDocumentationFor());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

