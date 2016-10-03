package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageEditorIterator theImageEditorIterator = (ImageEditorIterator)findAncestorWithClass(this, ImageEditorIterator.class);
			pageContext.getOut().print(theImageEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for editor tag ");
		}
		return SKIP_BODY;
	}
}

