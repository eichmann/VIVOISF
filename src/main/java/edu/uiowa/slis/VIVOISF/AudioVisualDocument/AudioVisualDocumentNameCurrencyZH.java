package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentNameCurrencyZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentNameCurrencyZH currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentNameCurrencyZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentNameCurrencyZHIterator theAudioVisualDocument = (AudioVisualDocumentNameCurrencyZHIterator)findAncestorWithClass(this, AudioVisualDocumentNameCurrencyZHIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getNameCurrencyZH());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for nameCurrencyZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for nameCurrencyZH tag ");
		}
		return SKIP_BODY;
	}
}

