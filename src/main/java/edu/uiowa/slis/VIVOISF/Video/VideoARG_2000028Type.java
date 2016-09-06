package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoARG_2000028Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoARG_2000028Type currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoARG_2000028Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			VideoARG_2000028Iterator theVideoARG_2000028Iterator = (VideoARG_2000028Iterator)findAncestorWithClass(this, VideoARG_2000028Iterator.class);
			pageContext.getOut().print(theVideoARG_2000028Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

