package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideEditorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideEditorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideEditorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideEditorListIterator theSlideEditorListIterator = (SlideEditorListIterator)findAncestorWithClass(this, SlideEditorListIterator.class);
			pageContext.getOut().print(theSlideEditorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for editorList tag ");
		}
		return SKIP_BODY;
	}
}

