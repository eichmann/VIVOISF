package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			VideoIAO_0000136Iterator theVideoIAO_0000136Iterator = (VideoIAO_0000136Iterator)findAncestorWithClass(this, VideoIAO_0000136Iterator.class);
			pageContext.getOut().print(theVideoIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

