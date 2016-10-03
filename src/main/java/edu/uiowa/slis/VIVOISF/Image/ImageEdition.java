package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ImageEditionIterator theImage = (ImageEditionIterator)findAncestorWithClass(this, ImageEditionIterator.class);
			pageContext.getOut().print(theImage.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for edition tag ");
		}
		return SKIP_BODY;
	}
}

