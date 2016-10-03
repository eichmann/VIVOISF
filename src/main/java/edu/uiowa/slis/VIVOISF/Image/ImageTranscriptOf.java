package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageTranscriptOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageTranscriptOf currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageTranscriptOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageTranscriptOfIterator theImageTranscriptOfIterator = (ImageTranscriptOfIterator)findAncestorWithClass(this, ImageTranscriptOfIterator.class);
			pageContext.getOut().print(theImageTranscriptOfIterator.getTranscriptOf());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

