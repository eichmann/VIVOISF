package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowHasAddressType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowHasAddressType currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowHasAddressType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowHasAddressIterator theSlideshowHasAddressIterator = (SlideshowHasAddressIterator)findAncestorWithClass(this, SlideshowHasAddressIterator.class);
			pageContext.getOut().print(theSlideshowHasAddressIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for hasAddress tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for hasAddress tag ");
		}
		return SKIP_BODY;
	}
}

