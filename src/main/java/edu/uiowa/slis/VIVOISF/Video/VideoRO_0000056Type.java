package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			VideoRO_0000056Iterator theVideoRO_0000056Iterator = (VideoRO_0000056Iterator)findAncestorWithClass(this, VideoRO_0000056Iterator.class);
			pageContext.getOut().print(theVideoRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

