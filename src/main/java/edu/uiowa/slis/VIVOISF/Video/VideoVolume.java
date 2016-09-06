package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			VideoVolumeIterator theVideo = (VideoVolumeIterator)findAncestorWithClass(this, VideoVolumeIterator.class);
			pageContext.getOut().print(theVideo.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for volume tag ");
		}
		return SKIP_BODY;
	}
}

