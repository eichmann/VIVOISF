package edu.uiowa.slis.VIVOISF.WorkingPaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class WorkingPaperTranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static WorkingPaperTranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(WorkingPaperTranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			WorkingPaperTranscriptOfIterator theWorkingPaperTranscriptOfIterator = (WorkingPaperTranscriptOfIterator)findAncestorWithClass(this, WorkingPaperTranscriptOfIterator.class);
			pageContext.getOut().print(theWorkingPaperTranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing WorkingPaper for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing WorkingPaper for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

