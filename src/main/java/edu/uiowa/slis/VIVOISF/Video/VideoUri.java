package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoUri currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			VideoUriIterator theVideo = (VideoUriIterator)findAncestorWithClass(this, VideoUriIterator.class);
			pageContext.getOut().print(theVideo.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for uri tag ");
		}
		return SKIP_BODY;
	}
}

