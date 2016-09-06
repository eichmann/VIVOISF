package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageCitedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageCitedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageCitedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageCitedByIterator theImageCitedByIterator = (ImageCitedByIterator)findAncestorWithClass(this, ImageCitedByIterator.class);
			pageContext.getOut().print(theImageCitedByIterator.getCitedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

