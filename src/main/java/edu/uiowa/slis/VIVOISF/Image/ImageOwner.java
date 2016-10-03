package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageOwnerIterator theImageOwnerIterator = (ImageOwnerIterator)findAncestorWithClass(this, ImageOwnerIterator.class);
			pageContext.getOut().print(theImageOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for owner tag ");
		}
		return SKIP_BODY;
	}
}

