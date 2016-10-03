package edu.uiowa.slis.VIVOISF.Slide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SlideTranscriptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SlideTranscriptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(SlideTranscriptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SlideTranscriptOfIterator theSlideTranscriptOfIterator = (SlideTranscriptOfIterator)findAncestorWithClass(this, SlideTranscriptOfIterator.class);
			pageContext.getOut().print(theSlideTranscriptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Slide for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Slide for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

