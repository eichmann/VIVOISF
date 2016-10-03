package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ImageShortDescriptionIterator theImage = (ImageShortDescriptionIterator)findAncestorWithClass(this, ImageShortDescriptionIterator.class);
			pageContext.getOut().print(theImage.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

