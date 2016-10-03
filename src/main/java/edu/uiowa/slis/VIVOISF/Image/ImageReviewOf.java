package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageReviewOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageReviewOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageReviewOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageReviewOfIterator theImageReviewOfIterator = (ImageReviewOfIterator)findAncestorWithClass(this, ImageReviewOfIterator.class);
			pageContext.getOut().print(theImageReviewOfIterator.getReviewOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

