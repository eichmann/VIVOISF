package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			VideoRelatedByIterator theVideoRelatedByIterator = (VideoRelatedByIterator)findAncestorWithClass(this, VideoRelatedByIterator.class);
			pageContext.getOut().print(theVideoRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

