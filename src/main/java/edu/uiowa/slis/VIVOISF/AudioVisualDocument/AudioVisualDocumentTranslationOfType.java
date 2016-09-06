package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentTranslationOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentTranslationOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentTranslationOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentTranslationOfIterator theAudioVisualDocumentTranslationOfIterator = (AudioVisualDocumentTranslationOfIterator)findAncestorWithClass(this, AudioVisualDocumentTranslationOfIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentTranslationOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for translationOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for translationOf tag ");
		}
		return SKIP_BODY;
	}
}

