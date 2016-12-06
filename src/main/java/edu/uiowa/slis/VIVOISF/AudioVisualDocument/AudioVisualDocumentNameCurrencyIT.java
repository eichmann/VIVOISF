package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentNameCurrencyIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentNameCurrencyIT currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentNameCurrencyIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentNameCurrencyITIterator theAudioVisualDocument = (AudioVisualDocumentNameCurrencyITIterator)findAncestorWithClass(this, AudioVisualDocumentNameCurrencyITIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getNameCurrencyIT());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for nameCurrencyIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for nameCurrencyIT tag ");
		}
		return SKIP_BODY;
	}
}

