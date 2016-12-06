package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentNameCurrencyEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentNameCurrencyEN currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentNameCurrencyEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentNameCurrencyENIterator theAudioVisualDocument = (AudioVisualDocumentNameCurrencyENIterator)findAncestorWithClass(this, AudioVisualDocumentNameCurrencyENIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getNameCurrencyEN());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for nameCurrencyEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for nameCurrencyEN tag ");
		}
		return SKIP_BODY;
	}
}

