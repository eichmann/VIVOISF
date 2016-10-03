package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoIsbn10 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoIsbn10 currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoIsbn10.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			VideoIsbn10Iterator theVideo = (VideoIsbn10Iterator)findAncestorWithClass(this, VideoIsbn10Iterator.class);
			pageContext.getOut().print(theVideo.getIsbn10());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for isbn10 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for isbn10 tag ");
		}
		return SKIP_BODY;
	}
}
