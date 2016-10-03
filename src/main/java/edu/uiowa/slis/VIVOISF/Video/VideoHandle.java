package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			VideoHandleIterator theVideo = (VideoHandleIterator)findAncestorWithClass(this, VideoHandleIterator.class);
			pageContext.getOut().print(theVideo.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for handle tag ");
		}
		return SKIP_BODY;
	}
}

