package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			VideoReviewOfIterator theVideoReviewOfIterator = (VideoReviewOfIterator)findAncestorWithClass(this, VideoReviewOfIterator.class);
			pageContext.getOut().print(theVideoReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

