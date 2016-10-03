package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentReviewOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentReviewOf currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentReviewOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentReviewOfIterator theAudioVisualDocumentReviewOfIterator = (AudioVisualDocumentReviewOfIterator)findAncestorWithClass(this, AudioVisualDocumentReviewOfIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentReviewOfIterator.getReviewOf());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

