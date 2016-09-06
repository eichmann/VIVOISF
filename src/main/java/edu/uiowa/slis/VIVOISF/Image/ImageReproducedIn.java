package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageReproducedIn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageReproducedIn currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageReproducedIn.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageReproducedInIterator theImageReproducedInIterator = (ImageReproducedInIterator)findAncestorWithClass(this, ImageReproducedInIterator.class);
			pageContext.getOut().print(theImageReproducedInIterator.getReproducedIn());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for reproducedIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for reproducedIn tag ");
		}
		return SKIP_BODY;
	}
}

