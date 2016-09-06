package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentHasTranslationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentHasTranslationType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentHasTranslationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentHasTranslationIterator theAudioVisualDocumentHasTranslationIterator = (AudioVisualDocumentHasTranslationIterator)findAncestorWithClass(this, AudioVisualDocumentHasTranslationIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentHasTranslationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

