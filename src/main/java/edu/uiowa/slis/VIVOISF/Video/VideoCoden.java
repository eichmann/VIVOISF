package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			VideoCodenIterator theVideo = (VideoCodenIterator)findAncestorWithClass(this, VideoCodenIterator.class);
			pageContext.getOut().print(theVideo.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for coden tag ");
		}
		return SKIP_BODY;
	}
}

