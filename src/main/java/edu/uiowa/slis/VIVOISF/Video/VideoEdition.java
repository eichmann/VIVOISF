package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			VideoEditionIterator theVideo = (VideoEditionIterator)findAncestorWithClass(this, VideoEditionIterator.class);
			pageContext.getOut().print(theVideo.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for edition tag ");
		}
		return SKIP_BODY;
	}
}

