package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperIsbn10Iterator theWorkingPaper = (WorkingPaperIsbn10Iterator)findAncestorWithClass(this, WorkingPaperIsbn10Iterator.class);
			pageContext.getOut().print(theWorkingPaper.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}

