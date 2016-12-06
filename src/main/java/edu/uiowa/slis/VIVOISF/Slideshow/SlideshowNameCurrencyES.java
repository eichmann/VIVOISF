package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowNameCurrencyESIterator theSlideshow = (SlideshowNameCurrencyESIterator)findAncestorWithClass(this, SlideshowNameCurrencyESIterator.class);
			pageContext.getOut().print(theSlideshow.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

