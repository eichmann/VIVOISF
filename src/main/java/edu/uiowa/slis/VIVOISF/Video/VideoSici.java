package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoSici currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			VideoSiciIterator theVideo = (VideoSiciIterator)findAncestorWithClass(this, VideoSiciIterator.class);
			pageContext.getOut().print(theVideo.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for sici tag ");
		}
		return SKIP_BODY;
	}
}

