package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ImageAsinIterator theImage = (ImageAsinIterator)findAncestorWithClass(this, ImageAsinIterator.class);
			pageContext.getOut().print(theImage.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for asin tag ");
		}
		return SKIP_BODY;
	}
}

