package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentReviewOfIterator theAudioVisualDocumentReviewOfIterator = (AudioVisualDocumentReviewOfIterator)findAncestorWithClass(this, AudioVisualDocumentReviewOfIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

