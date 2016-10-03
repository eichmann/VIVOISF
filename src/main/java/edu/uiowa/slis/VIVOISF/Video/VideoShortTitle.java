package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			VideoShortTitleIterator theVideo = (VideoShortTitleIterator)findAncestorWithClass(this, VideoShortTitleIterator.class);
			pageContext.getOut().print(theVideo.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

