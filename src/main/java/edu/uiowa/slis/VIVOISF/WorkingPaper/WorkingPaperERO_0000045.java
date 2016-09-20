package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperERO_0000045Iterator theWorkingPaper = (WorkingPaperERO_0000045Iterator)findAncestorWithClass(this, WorkingPaperERO_0000045Iterator.class);
			pageContext.getOut().print(theWorkingPaper.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

