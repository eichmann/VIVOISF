package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ImageShortTitleIterator theImage = (ImageShortTitleIterator)findAncestorWithClass(this, ImageShortTitleIterator.class);
			pageContext.getOut().print(theImage.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

