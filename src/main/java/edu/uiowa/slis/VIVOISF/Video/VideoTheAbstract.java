package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			VideoTheAbstractIterator theVideo = (VideoTheAbstractIterator)findAncestorWithClass(this, VideoTheAbstractIterator.class);
			pageContext.getOut().print(theVideo.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

