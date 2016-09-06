package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoDocumentationFor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoDocumentationFor currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoDocumentationFor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			VideoDocumentationForIterator theVideoDocumentationForIterator = (VideoDocumentationForIterator)findAncestorWithClass(this, VideoDocumentationForIterator.class);
			pageContext.getOut().print(theVideoDocumentationForIterator.getDocumentationFor());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for documentationFor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for documentationFor tag ");
		}
		return SKIP_BODY;
	}
}

