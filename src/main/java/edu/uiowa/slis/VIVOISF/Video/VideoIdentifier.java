package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoIdentifier extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoIdentifier currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoIdentifier.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			VideoIdentifierIterator theVideo = (VideoIdentifierIterator)findAncestorWithClass(this, VideoIdentifierIterator.class);
			pageContext.getOut().print(theVideo.getIdentifier());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for identifier tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for identifier tag ");
		}
		return SKIP_BODY;
	}
}

