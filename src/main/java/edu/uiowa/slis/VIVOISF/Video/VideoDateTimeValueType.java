package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoDateTimeValueType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoDateTimeValueType currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoDateTimeValueType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			VideoDateTimeValueIterator theVideoDateTimeValueIterator = (VideoDateTimeValueIterator)findAncestorWithClass(this, VideoDateTimeValueIterator.class);
			pageContext.getOut().print(theVideoDateTimeValueIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

