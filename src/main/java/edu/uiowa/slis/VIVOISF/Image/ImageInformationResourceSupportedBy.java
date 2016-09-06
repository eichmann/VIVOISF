package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageInformationResourceSupportedByIterator theImageInformationResourceSupportedByIterator = (ImageInformationResourceSupportedByIterator)findAncestorWithClass(this, ImageInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theImageInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

