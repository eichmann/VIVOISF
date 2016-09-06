package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			VideoRelatedByIterator theVideoRelatedByIterator = (VideoRelatedByIterator)findAncestorWithClass(this, VideoRelatedByIterator.class);
			pageContext.getOut().print(theVideoRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

