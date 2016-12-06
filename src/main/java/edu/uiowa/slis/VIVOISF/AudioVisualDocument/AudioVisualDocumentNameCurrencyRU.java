package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentNameCurrencyRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentNameCurrencyRU currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentNameCurrencyRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentNameCurrencyRUIterator theAudioVisualDocument = (AudioVisualDocumentNameCurrencyRUIterator)findAncestorWithClass(this, AudioVisualDocumentNameCurrencyRUIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getNameCurrencyRU());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for nameCurrencyRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for nameCurrencyRU tag ");
		}
		return SKIP_BODY;
	}
}

