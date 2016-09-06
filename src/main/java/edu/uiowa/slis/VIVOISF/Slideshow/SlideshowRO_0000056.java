package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowRO_0000056Iterator theSlideshowRO_0000056Iterator = (SlideshowRO_0000056Iterator)findAncestorWithClass(this, SlideshowRO_0000056Iterator.class);
			pageContext.getOut().print(theSlideshowRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

