package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentTranslatorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentTranslatorType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentTranslatorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentTranslatorIterator theAudioVisualDocumentTranslatorIterator = (AudioVisualDocumentTranslatorIterator)findAncestorWithClass(this, AudioVisualDocumentTranslatorIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentTranslatorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for translator tag ");
		}
		return SKIP_BODY;
	}
}

