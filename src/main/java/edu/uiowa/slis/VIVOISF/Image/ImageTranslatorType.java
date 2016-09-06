package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageTranslatorIterator theImageTranslatorIterator = (ImageTranslatorIterator)findAncestorWithClass(this, ImageTranslatorIterator.class);
			pageContext.getOut().print(theImageTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for translator tag ");
		}
		return SKIP_BODY;
	}
}

