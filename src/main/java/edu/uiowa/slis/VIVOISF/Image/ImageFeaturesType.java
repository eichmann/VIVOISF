package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageFeaturesIterator theImageFeaturesIterator = (ImageFeaturesIterator)findAncestorWithClass(this, ImageFeaturesIterator.class);
			pageContext.getOut().print(theImageFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for features tag ");
		}
		return SKIP_BODY;
	}
}

