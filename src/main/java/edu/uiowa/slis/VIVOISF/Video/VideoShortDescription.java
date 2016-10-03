package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			VideoShortDescriptionIterator theVideo = (VideoShortDescriptionIterator)findAncestorWithClass(this, VideoShortDescriptionIterator.class);
			pageContext.getOut().print(theVideo.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

