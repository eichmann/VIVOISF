package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			VideoLocatorIterator theVideo = (VideoLocatorIterator)findAncestorWithClass(this, VideoLocatorIterator.class);
			pageContext.getOut().print(theVideo.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for locator tag ");
		}
		return SKIP_BODY;
	}
}

