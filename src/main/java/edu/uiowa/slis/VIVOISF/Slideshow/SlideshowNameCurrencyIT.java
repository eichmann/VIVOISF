package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowNameCurrencyITIterator theSlideshow = (SlideshowNameCurrencyITIterator)findAncestorWithClass(this, SlideshowNameCurrencyITIterator.class);
			pageContext.getOut().print(theSlideshow.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

