package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			VideoFeaturesIterator theVideoFeaturesIterator = (VideoFeaturesIterator)findAncestorWithClass(this, VideoFeaturesIterator.class);
			pageContext.getOut().print(theVideoFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for features tag ");
		}
		return SKIP_BODY;
	}
}

