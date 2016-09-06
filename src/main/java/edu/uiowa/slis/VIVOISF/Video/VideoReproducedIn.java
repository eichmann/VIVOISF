package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoReproducedIn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoReproducedIn currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoReproducedIn.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			VideoReproducedInIterator theVideoReproducedInIterator = (VideoReproducedInIterator)findAncestorWithClass(this, VideoReproducedInIterator.class);
			pageContext.getOut().print(theVideoReproducedInIterator.getReproducedIn());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

