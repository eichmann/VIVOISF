package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoARG_0000001 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoARG_0000001 currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoARG_0000001.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			VideoARG_0000001Iterator theVideo = (VideoARG_0000001Iterator)findAncestorWithClass(this, VideoARG_0000001Iterator.class);
			pageContext.getOut().print(theVideo.getARG_0000001());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for ARG_0000001 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for ARG_0000001 tag ");
		}
		return SKIP_BODY;
	}
}

