package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoReproduces extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoReproduces currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoReproduces.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			VideoReproducesIterator theVideoReproducesIterator = (VideoReproducesIterator)findAncestorWithClass(this, VideoReproducesIterator.class);
			pageContext.getOut().print(theVideoReproducesIterator.getReproduces());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

