package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ImageNumberIterator theImage = (ImageNumberIterator)findAncestorWithClass(this, ImageNumberIterator.class);
			pageContext.getOut().print(theImage.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for number tag ");
		}
		return SKIP_BODY;
	}
}

