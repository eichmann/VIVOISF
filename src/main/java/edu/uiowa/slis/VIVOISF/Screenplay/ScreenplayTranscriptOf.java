package edu.uiowa.slis.VIVOISF.Screenplay;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ScreenplayTranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ScreenplayTranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ScreenplayTranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ScreenplayTranscriptOfIterator theScreenplayTranscriptOfIterator = (ScreenplayTranscriptOfIterator)findAncestorWithClass(this, ScreenplayTranscriptOfIterator.class);
			pageContext.getOut().print(theScreenplayTranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Screenplay for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Screenplay for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

