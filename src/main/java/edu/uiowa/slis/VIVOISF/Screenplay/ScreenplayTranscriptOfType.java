package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayTranscriptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayTranscriptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayTranscriptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScreenplayTranscriptOfIterator theScreenplayTranscriptOfIterator = (ScreenplayTranscriptOfIterator)findAncestorWithClass(this, ScreenplayTranscriptOfIterator.class);
			pageContext.getOut().print(theScreenplayTranscriptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

