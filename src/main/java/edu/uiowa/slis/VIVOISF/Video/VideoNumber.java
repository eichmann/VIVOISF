package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			VideoNumberIterator theVideo = (VideoNumberIterator)findAncestorWithClass(this, VideoNumberIterator.class);
			pageContext.getOut().print(theVideo.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for number tag ");
		}
		return SKIP_BODY;
	}
}

