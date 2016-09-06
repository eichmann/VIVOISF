package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoDateTimeValue extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoDateTimeValue currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoDateTimeValue.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			VideoDateTimeValueIterator theVideoDateTimeValueIterator = (VideoDateTimeValueIterator)findAncestorWithClass(this, VideoDateTimeValueIterator.class);
			pageContext.getOut().print(theVideoDateTimeValueIterator.getDateTimeValue());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for dateTimeValue tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for dateTimeValue tag ");
		}
		return SKIP_BODY;
	}
}

