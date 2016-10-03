package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterTranscriptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterTranscriptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterTranscriptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterTranscriptOfIterator theConferencePosterTranscriptOfIterator = (ConferencePosterTranscriptOfIterator)findAncestorWithClass(this, ConferencePosterTranscriptOfIterator.class);
			pageContext.getOut().print(theConferencePosterTranscriptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

