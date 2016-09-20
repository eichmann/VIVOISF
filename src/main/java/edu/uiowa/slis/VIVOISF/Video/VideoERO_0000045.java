package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			VideoERO_0000045Iterator theVideo = (VideoERO_0000045Iterator)findAncestorWithClass(this, VideoERO_0000045Iterator.class);
			pageContext.getOut().print(theVideo.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

