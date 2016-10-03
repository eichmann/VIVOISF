package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			VideoAsinIterator theVideo = (VideoAsinIterator)findAncestorWithClass(this, VideoAsinIterator.class);
			pageContext.getOut().print(theVideo.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for asin tag ");
		}
		return SKIP_BODY;
	}
}

