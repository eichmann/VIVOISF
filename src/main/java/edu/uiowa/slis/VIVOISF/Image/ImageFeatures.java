package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageFeaturesIterator theImageFeaturesIterator = (ImageFeaturesIterator)findAncestorWithClass(this, ImageFeaturesIterator.class);
			pageContext.getOut().print(theImageFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for features tag ");
		}
		return SKIP_BODY;
	}
}

