package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageReproducesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageReproducesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageReproducesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageReproducesIterator theImageReproducesIterator = (ImageReproducesIterator)findAncestorWithClass(this, ImageReproducesIterator.class);
			pageContext.getOut().print(theImageReproducesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for reproduces tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for reproduces tag ");
		}
		return SKIP_BODY;
	}
}

