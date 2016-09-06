package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageVolume extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageVolume currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageVolume.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ImageVolumeIterator theImage = (ImageVolumeIterator)findAncestorWithClass(this, ImageVolumeIterator.class);
			pageContext.getOut().print(theImage.getVolume());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for volume tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for volume tag ");
		}
		return SKIP_BODY;
	}
}

