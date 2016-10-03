package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			VideoGtin14Iterator theVideo = (VideoGtin14Iterator)findAncestorWithClass(this, VideoGtin14Iterator.class);
			pageContext.getOut().print(theVideo.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

