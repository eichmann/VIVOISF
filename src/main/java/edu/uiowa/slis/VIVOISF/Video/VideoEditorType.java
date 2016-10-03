package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			VideoEditorIterator theVideoEditorIterator = (VideoEditorIterator)findAncestorWithClass(this, VideoEditorIterator.class);
			pageContext.getOut().print(theVideoEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for editor tag ");
		}
		return SKIP_BODY;
	}
}

