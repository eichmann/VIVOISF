package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperTranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperTranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperTranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperTranscriptOfIterator theConferencePaperTranscriptOfIterator = (ConferencePaperTranscriptOfIterator)findAncestorWithClass(this, ConferencePaperTranscriptOfIterator.class);
			pageContext.getOut().print(theConferencePaperTranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

