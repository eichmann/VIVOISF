package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			VideoPageStartIterator theVideo = (VideoPageStartIterator)findAncestorWithClass(this, VideoPageStartIterator.class);
			pageContext.getOut().print(theVideo.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

