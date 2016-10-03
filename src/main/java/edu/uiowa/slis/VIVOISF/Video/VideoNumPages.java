package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			VideoNumPagesIterator theVideo = (VideoNumPagesIterator)findAncestorWithClass(this, VideoNumPagesIterator.class);
			pageContext.getOut().print(theVideo.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for numPages tag ");
		}
		return SKIP_BODY;
	}
}

