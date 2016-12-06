package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowCodeCurrencyIterator theSlideshow = (SlideshowCodeCurrencyIterator)findAncestorWithClass(this, SlideshowCodeCurrencyIterator.class);
			pageContext.getOut().print(theSlideshow.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

