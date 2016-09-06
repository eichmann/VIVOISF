package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageHasTranslation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageHasTranslation currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageHasTranslation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageHasTranslationIterator theImageHasTranslationIterator = (ImageHasTranslationIterator)findAncestorWithClass(this, ImageHasTranslationIterator.class);
			pageContext.getOut().print(theImageHasTranslationIterator.getHasTranslation());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

