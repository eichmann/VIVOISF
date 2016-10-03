package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageSection extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageSection currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageSection.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ImageSectionIterator theImage = (ImageSectionIterator)findAncestorWithClass(this, ImageSectionIterator.class);
			pageContext.getOut().print(theImage.getSection());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for section tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for section tag ");
		}
		return SKIP_BODY;
	}
}

