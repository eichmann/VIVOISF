package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			VideoOclcnumIterator theVideo = (VideoOclcnumIterator)findAncestorWithClass(this, VideoOclcnumIterator.class);
			pageContext.getOut().print(theVideo.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

