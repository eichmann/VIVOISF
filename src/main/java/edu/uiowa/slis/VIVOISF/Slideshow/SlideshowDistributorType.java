package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowDistributorIterator theSlideshowDistributorIterator = (SlideshowDistributorIterator)findAncestorWithClass(this, SlideshowDistributorIterator.class);
			pageContext.getOut().print(theSlideshowDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for distributor tag ");
		}
		return SKIP_BODY;
	}
}

