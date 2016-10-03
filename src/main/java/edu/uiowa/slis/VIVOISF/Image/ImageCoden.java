package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ImageCodenIterator theImage = (ImageCodenIterator)findAncestorWithClass(this, ImageCodenIterator.class);
			pageContext.getOut().print(theImage.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for coden tag ");
		}
		return SKIP_BODY;
	}
}

