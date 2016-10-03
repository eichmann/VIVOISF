package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImagePages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImagePages currentInstance = null;
	private static final Log log = LogFactory.getLog(ImagePages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ImagePagesIterator theImage = (ImagePagesIterator)findAncestorWithClass(this, ImagePagesIterator.class);
			pageContext.getOut().print(theImage.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for pages tag ");
		}
		return SKIP_BODY;
	}
}

