package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoDirector extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoDirector currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoDirector.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			VideoDirectorIterator theVideoDirectorIterator = (VideoDirectorIterator)findAncestorWithClass(this, VideoDirectorIterator.class);
			pageContext.getOut().print(theVideoDirectorIterator.getDirector());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for director tag ");
		}
		return SKIP_BODY;
	}
}

