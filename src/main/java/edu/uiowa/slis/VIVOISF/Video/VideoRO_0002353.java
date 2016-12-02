package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoRO_0002353 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoRO_0002353 currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoRO_0002353.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			VideoRO_0002353Iterator theVideo = (VideoRO_0002353Iterator)findAncestorWithClass(this, VideoRO_0002353Iterator.class);
			pageContext.getOut().print(theVideo.getRO_0002353());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

