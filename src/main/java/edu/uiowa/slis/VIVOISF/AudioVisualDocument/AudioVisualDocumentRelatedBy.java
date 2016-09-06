package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentRelatedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentRelatedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentRelatedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentRelatedByIterator theAudioVisualDocumentRelatedByIterator = (AudioVisualDocumentRelatedByIterator)findAncestorWithClass(this, AudioVisualDocumentRelatedByIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentRelatedByIterator.getRelatedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

