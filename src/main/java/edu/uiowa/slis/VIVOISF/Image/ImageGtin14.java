package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ImageGtin14Iterator theImage = (ImageGtin14Iterator)findAncestorWithClass(this, ImageGtin14Iterator.class);
			pageContext.getOut().print(theImage.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

