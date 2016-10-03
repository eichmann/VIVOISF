package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperLccnIterator theWorkingPaper = (WorkingPaperLccnIterator)findAncestorWithClass(this, WorkingPaperLccnIterator.class);
			pageContext.getOut().print(theWorkingPaper.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for lccn tag ");
		}
		return SKIP_BODY;
	}
}
