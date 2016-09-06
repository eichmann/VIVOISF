package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoTranslationOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoTranslationOf currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoTranslationOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			VideoTranslationOfIterator theVideoTranslationOfIterator = (VideoTranslationOfIterator)findAncestorWithClass(this, VideoTranslationOfIterator.class);
			pageContext.getOut().print(theVideoTranslationOfIterator.getTranslationOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

