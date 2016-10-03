package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowIssuerIterator theSlideshowIssuerIterator = (SlideshowIssuerIterator)findAncestorWithClass(this, SlideshowIssuerIterator.class);
			pageContext.getOut().print(theSlideshowIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for issuer tag ");
		}
		return SKIP_BODY;
	}
}

