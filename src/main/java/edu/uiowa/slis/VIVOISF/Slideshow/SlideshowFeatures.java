package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowFeaturesIterator theSlideshowFeaturesIterator = (SlideshowFeaturesIterator)findAncestorWithClass(this, SlideshowFeaturesIterator.class);
			pageContext.getOut().print(theSlideshowFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for features tag ");
		}
		return SKIP_BODY;
	}
}

