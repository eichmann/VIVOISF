package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideFeatures extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideFeatures currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideFeatures.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideFeaturesIterator theSlideFeaturesIterator = (SlideFeaturesIterator)findAncestorWithClass(this, SlideFeaturesIterator.class);
			pageContext.getOut().print(theSlideFeaturesIterator.getFeatures());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for features tag ");
		}
		return SKIP_BODY;
	}
}

