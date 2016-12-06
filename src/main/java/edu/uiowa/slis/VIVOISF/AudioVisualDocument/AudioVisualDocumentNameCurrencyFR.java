package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentNameCurrencyFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentNameCurrencyFR currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentNameCurrencyFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentNameCurrencyFRIterator theAudioVisualDocument = (AudioVisualDocumentNameCurrencyFRIterator)findAncestorWithClass(this, AudioVisualDocumentNameCurrencyFRIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getNameCurrencyFR());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for nameCurrencyFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for nameCurrencyFR tag ");
		}
		return SKIP_BODY;
	}
}

