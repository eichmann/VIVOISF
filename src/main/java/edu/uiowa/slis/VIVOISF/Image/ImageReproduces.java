package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageReproduces extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageReproduces currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageReproduces.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageReproducesIterator theImageReproducesIterator = (ImageReproducesIterator)findAncestorWithClass(this, ImageReproducesIterator.class);
			pageContext.getOut().print(theImageReproducesIterator.getReproduces());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

