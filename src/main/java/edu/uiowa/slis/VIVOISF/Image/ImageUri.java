package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageUri currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ImageUriIterator theImage = (ImageUriIterator)findAncestorWithClass(this, ImageUriIterator.class);
			pageContext.getOut().print(theImage.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for uri tag ");
		}
		return SKIP_BODY;
	}
}

