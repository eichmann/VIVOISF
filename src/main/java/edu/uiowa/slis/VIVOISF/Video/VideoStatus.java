package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoStatus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			VideoStatusIterator theVideoStatusIterator = (VideoStatusIterator)findAncestorWithClass(this, VideoStatusIterator.class);
			pageContext.getOut().print(theVideoStatusIterator.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for status tag ");
		}
		return SKIP_BODY;
	}
}

