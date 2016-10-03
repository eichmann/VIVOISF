package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperSection currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperSectionIterator theWorkingPaper = (WorkingPaperSectionIterator)findAncestorWithClass(this, WorkingPaperSectionIterator.class);
			pageContext.getOut().print(theWorkingPaper.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for section tag ");
		}
		return SKIP_BODY;
	}
}

