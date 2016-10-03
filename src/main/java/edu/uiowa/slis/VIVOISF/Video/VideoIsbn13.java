package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoIsbn13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoIsbn13 currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoIsbn13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			VideoIsbn13Iterator theVideo = (VideoIsbn13Iterator)findAncestorWithClass(this, VideoIsbn13Iterator.class);
			pageContext.getOut().print(theVideo.getIsbn13());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for isbn13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for isbn13 tag ");
		}
		return SKIP_BODY;
	}
}

