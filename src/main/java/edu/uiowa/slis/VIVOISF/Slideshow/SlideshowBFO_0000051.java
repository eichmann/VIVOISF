package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowBFO_0000051 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowBFO_0000051 currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowBFO_0000051.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowBFO_0000051Iterator theSlideshowBFO_0000051Iterator = (SlideshowBFO_0000051Iterator)findAncestorWithClass(this, SlideshowBFO_0000051Iterator.class);
			pageContext.getOut().print(theSlideshowBFO_0000051Iterator.getBFO_0000051());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

