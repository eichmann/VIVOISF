package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			VideoEanucc13Iterator theVideo = (VideoEanucc13Iterator)findAncestorWithClass(this, VideoEanucc13Iterator.class);
			pageContext.getOut().print(theVideo.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

