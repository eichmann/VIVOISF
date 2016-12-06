package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowBFO_0000050 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowBFO_0000050 currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowBFO_0000050.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowBFO_0000050Iterator theSlideshowBFO_0000050Iterator = (SlideshowBFO_0000050Iterator)findAncestorWithClass(this, SlideshowBFO_0000050Iterator.class);
			pageContext.getOut().print(theSlideshowBFO_0000050Iterator.getBFO_0000050());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

