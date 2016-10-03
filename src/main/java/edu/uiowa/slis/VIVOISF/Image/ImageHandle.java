package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ImageHandleIterator theImage = (ImageHandleIterator)findAncestorWithClass(this, ImageHandleIterator.class);
			pageContext.getOut().print(theImage.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for handle tag ");
		}
		return SKIP_BODY;
	}
}

