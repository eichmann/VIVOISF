package edu.uiowa.slis.VIVOISF.Video;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VideoEditorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VideoEditorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(VideoEditorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			VideoEditorListIterator theVideoEditorListIterator = (VideoEditorListIterator)findAncestorWithClass(this, VideoEditorListIterator.class);
			pageContext.getOut().print(theVideoEditorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Video for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Video for editorList tag ");
		}
		return SKIP_BODY;
	}
}

