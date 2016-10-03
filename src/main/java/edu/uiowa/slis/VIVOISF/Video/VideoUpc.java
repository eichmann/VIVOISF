package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			VideoUpcIterator theVideo = (VideoUpcIterator)findAncestorWithClass(this, VideoUpcIterator.class);
			pageContext.getOut().print(theVideo.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for upc tag ");
		}
		return SKIP_BODY;
	}
}

