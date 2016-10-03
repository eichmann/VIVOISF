package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowProducer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowProducer currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowProducer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowProducerIterator theSlideshowProducerIterator = (SlideshowProducerIterator)findAncestorWithClass(this, SlideshowProducerIterator.class);
			pageContext.getOut().print(theSlideshowProducerIterator.getProducer());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for producer tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for producer tag ");
		}
		return SKIP_BODY;
	}
}

