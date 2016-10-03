package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideTranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideTranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideTranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideTranscriptOfIterator theSlideTranscriptOfIterator = (SlideTranscriptOfIterator)findAncestorWithClass(this, SlideTranscriptOfIterator.class);
			pageContext.getOut().print(theSlideTranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

