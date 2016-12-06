package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowNameCurrencyFRIterator theSlideshow = (SlideshowNameCurrencyFRIterator)findAncestorWithClass(this, SlideshowNameCurrencyFRIterator.class);
			pageContext.getOut().print(theSlideshow.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

