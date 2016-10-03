package edu.uiowa.slis.VIVOISF.Slideshow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideshowTranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideshowTranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideshowTranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideshowTranscriptOfIterator theSlideshowTranscriptOfIterator = (SlideshowTranscriptOfIterator)findAncestorWithClass(this, SlideshowTranscriptOfIterator.class);
			pageContext.getOut().print(theSlideshowTranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Slideshow for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slideshow for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

