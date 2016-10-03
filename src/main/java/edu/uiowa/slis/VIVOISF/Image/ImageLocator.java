package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ImageLocatorIterator theImage = (ImageLocatorIterator)findAncestorWithClass(this, ImageLocatorIterator.class);
			pageContext.getOut().print(theImage.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for locator tag ");
		}
		return SKIP_BODY;
	}
}

