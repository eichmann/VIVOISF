package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowNameCurrencyENIterator theSlideshow = (SlideshowNameCurrencyENIterator)findAncestorWithClass(this, SlideshowNameCurrencyENIterator.class);
			pageContext.getOut().print(theSlideshow.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

