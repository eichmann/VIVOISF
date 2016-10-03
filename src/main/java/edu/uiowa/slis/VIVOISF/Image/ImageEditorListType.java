package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageEditorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageEditorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageEditorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageEditorListIterator theImageEditorListIterator = (ImageEditorListIterator)findAncestorWithClass(this, ImageEditorListIterator.class);
			pageContext.getOut().print(theImageEditorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for editorList tag ");
		}
		return SKIP_BODY;
	}
}

