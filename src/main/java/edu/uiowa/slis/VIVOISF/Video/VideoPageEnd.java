package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			VideoPageEndIterator theVideo = (VideoPageEndIterator)findAncestorWithClass(this, VideoPageEndIterator.class);
			pageContext.getOut().print(theVideo.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

