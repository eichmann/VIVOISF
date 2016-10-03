package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			VideoLccnIterator theVideo = (VideoLccnIterator)findAncestorWithClass(this, VideoLccnIterator.class);
			pageContext.getOut().print(theVideo.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for lccn tag ");
		}
		return SKIP_BODY;
	}
}

