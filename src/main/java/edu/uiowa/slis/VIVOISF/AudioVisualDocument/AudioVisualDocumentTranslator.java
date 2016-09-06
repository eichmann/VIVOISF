package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentTranslator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentTranslator currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentTranslator.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentTranslatorIterator theAudioVisualDocumentTranslatorIterator = (AudioVisualDocumentTranslatorIterator)findAncestorWithClass(this, AudioVisualDocumentTranslatorIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentTranslatorIterator.getTranslator());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for translator tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for translator tag ");
		}
		return SKIP_BODY;
	}
}

