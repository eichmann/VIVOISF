package edu.uiowa.slis.VIVOISF.Image;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ImageTranscriptOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ImageTranscriptOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(ImageTranscriptOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ImageTranscriptOfIterator theImageTranscriptOfIterator = (ImageTranscriptOfIterator)findAncestorWithClass(this, ImageTranscriptOfIterator.class);
			pageContext.getOut().print(theImageTranscriptOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Image for transcriptOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Image for transcriptOf tag ");
		}
		return SKIP_BODY;
	}
}

