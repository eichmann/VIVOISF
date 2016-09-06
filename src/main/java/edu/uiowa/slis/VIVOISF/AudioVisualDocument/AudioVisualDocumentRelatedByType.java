package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentRelatedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentRelatedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentRelatedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentRelatedByIterator theAudioVisualDocumentRelatedByIterator = (AudioVisualDocumentRelatedByIterator)findAncestorWithClass(this, AudioVisualDocumentRelatedByIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentRelatedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for relatedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for relatedBy tag ");
		}
		return SKIP_BODY;
	}
}

