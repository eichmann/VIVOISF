package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoTranscriptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoTranscriptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoTranscriptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			VideoTranscriptOfIterator theVideoTranscriptOfIterator = (VideoTranscriptOfIterator)findAncestorWithClass(this, VideoTranscriptOfIterator.class);
			pageContext.getOut().print(theVideoTranscriptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

