package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperVolumeIterator theWorkingPaper = (WorkingPaperVolumeIterator)findAncestorWithClass(this, WorkingPaperVolumeIterator.class);
			pageContext.getOut().print(theWorkingPaper.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for volume tag ");
		}
		return SKIP_BODY;
	}
}

