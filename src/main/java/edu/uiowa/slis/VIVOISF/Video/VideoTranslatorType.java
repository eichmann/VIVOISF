package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			VideoTranslatorIterator theVideoTranslatorIterator = (VideoTranslatorIterator)findAncestorWithClass(this, VideoTranslatorIterator.class);
			pageContext.getOut().print(theVideoTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for translator tag ");
		}
		return SKIP_BODY;
	}
}

