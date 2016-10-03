package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ImageUpcIterator theImage = (ImageUpcIterator)findAncestorWithClass(this, ImageUpcIterator.class);
			pageContext.getOut().print(theImage.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for upc tag ");
		}
		return SKIP_BODY;
	}
}

