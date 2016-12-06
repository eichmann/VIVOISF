package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentCodeCurrency extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentCodeCurrency currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentCodeCurrency.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentCodeCurrencyIterator theAudioVisualDocument = (AudioVisualDocumentCodeCurrencyIterator)findAncestorWithClass(this, AudioVisualDocumentCodeCurrencyIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getCodeCurrency());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for codeCurrency tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for codeCurrency tag ");
		}
		return SKIP_BODY;
	}
}

