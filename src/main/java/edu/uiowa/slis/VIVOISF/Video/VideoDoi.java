package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			VideoDoiIterator theVideo = (VideoDoiIterator)findAncestorWithClass(this, VideoDoiIterator.class);
			pageContext.getOut().print(theVideo.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for doi tag ");
		}
		return SKIP_BODY;
	}
}

