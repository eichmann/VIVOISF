package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageContent currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ImageContentIterator theImage = (ImageContentIterator)findAncestorWithClass(this, ImageContentIterator.class);
			pageContext.getOut().print(theImage.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for content tag ");
		}
		return SKIP_BODY;
	}
}

