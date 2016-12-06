package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SlideshowCodeFAOTERMIterator theSlideshow = (SlideshowCodeFAOTERMIterator)findAncestorWithClass(this, SlideshowCodeFAOTERMIterator.class);
			pageContext.getOut().print(theSlideshow.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

