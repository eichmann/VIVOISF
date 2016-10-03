package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoSection currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			VideoSectionIterator theVideo = (VideoSectionIterator)findAncestorWithClass(this, VideoSectionIterator.class);
			pageContext.getOut().print(theVideo.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for section tag ");
		}
		return SKIP_BODY;
	}
}

