package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperEanucc13Iterator theWorkingPaper = (WorkingPaperEanucc13Iterator)findAncestorWithClass(this, WorkingPaperEanucc13Iterator.class);
			pageContext.getOut().print(theWorkingPaper.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

