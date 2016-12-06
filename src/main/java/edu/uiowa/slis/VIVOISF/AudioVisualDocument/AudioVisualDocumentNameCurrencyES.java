package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentNameCurrencyES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentNameCurrencyES currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentNameCurrencyES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentNameCurrencyESIterator theAudioVisualDocument = (AudioVisualDocumentNameCurrencyESIterator)findAncestorWithClass(this, AudioVisualDocumentNameCurrencyESIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getNameCurrencyES());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for nameCurrencyES tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for nameCurrencyES tag ");
		}
		return SKIP_BODY;
	}
}

