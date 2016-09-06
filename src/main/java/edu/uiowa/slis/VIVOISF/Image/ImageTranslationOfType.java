package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageTranslationOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageTranslationOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageTranslationOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageTranslationOfIterator theImageTranslationOfIterator = (ImageTranslationOfIterator)findAncestorWithClass(this, ImageTranslationOfIterator.class);
			pageContext.getOut().print(theImageTranslationOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

