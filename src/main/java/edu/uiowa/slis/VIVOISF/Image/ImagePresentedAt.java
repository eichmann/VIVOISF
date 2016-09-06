package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImagePresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImagePresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(ImagePresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImagePresentedAtIterator theImagePresentedAtIterator = (ImagePresentedAtIterator)findAncestorWithClass(this, ImagePresentedAtIterator.class);
			pageContext.getOut().print(theImagePresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

