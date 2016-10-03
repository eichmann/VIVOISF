package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoTranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoTranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoTranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			VideoTranscriptOfIterator theVideoTranscriptOfIterator = (VideoTranscriptOfIterator)findAncestorWithClass(this, VideoTranscriptOfIterator.class);
			pageContext.getOut().print(theVideoTranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

