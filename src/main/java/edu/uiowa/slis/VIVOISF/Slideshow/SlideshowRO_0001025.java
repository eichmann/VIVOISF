package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowRO_0001025 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowRO_0001025 currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowRO_0001025.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowRO_0001025Iterator theSlideshowRO_0001025Iterator = (SlideshowRO_0001025Iterator)findAncestorWithClass(this, SlideshowRO_0001025Iterator.class);
			pageContext.getOut().print(theSlideshowRO_0001025Iterator.getRO_0001025());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

