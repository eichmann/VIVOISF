package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoDirectorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoDirectorType currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoDirectorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			VideoDirectorIterator theVideoDirectorIterator = (VideoDirectorIterator)findAncestorWithClass(this, VideoDirectorIterator.class);
			pageContext.getOut().print(theVideoDirectorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for director tag ");
		}
		return SKIP_BODY;
	}
}

