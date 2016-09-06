package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImagePresentedAtType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImagePresentedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(ImagePresentedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImagePresentedAtIterator theImagePresentedAtIterator = (ImagePresentedAtIterator)findAncestorWithClass(this, ImagePresentedAtIterator.class);
			pageContext.getOut().print(theImagePresentedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

