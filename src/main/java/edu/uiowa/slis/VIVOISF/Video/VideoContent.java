package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoContent currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			VideoContentIterator theVideo = (VideoContentIterator)findAncestorWithClass(this, VideoContentIterator.class);
			pageContext.getOut().print(theVideo.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for content tag ");
		}
		return SKIP_BODY;
	}
}

