package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageCitesIterator theImageCitesIterator = (ImageCitesIterator)findAncestorWithClass(this, ImageCitesIterator.class);
			pageContext.getOut().print(theImageCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for cites tag ");
		}
		return SKIP_BODY;
	}
}

