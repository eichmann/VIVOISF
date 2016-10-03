package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoPages currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			VideoPagesIterator theVideo = (VideoPagesIterator)findAncestorWithClass(this, VideoPagesIterator.class);
			pageContext.getOut().print(theVideo.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for pages tag ");
		}
		return SKIP_BODY;
	}
}

