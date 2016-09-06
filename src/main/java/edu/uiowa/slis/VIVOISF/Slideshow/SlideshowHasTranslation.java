package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowHasTranslation extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowHasTranslation currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowHasTranslation.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowHasTranslationIterator theSlideshowHasTranslationIterator = (SlideshowHasTranslationIterator)findAncestorWithClass(this, SlideshowHasTranslationIterator.class);
			pageContext.getOut().print(theSlideshowHasTranslationIterator.getHasTranslation());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

