package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoHasTranslationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoHasTranslationType currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoHasTranslationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			VideoHasTranslationIterator theVideoHasTranslationIterator = (VideoHasTranslationIterator)findAncestorWithClass(this, VideoHasTranslationIterator.class);
			pageContext.getOut().print(theVideoHasTranslationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

