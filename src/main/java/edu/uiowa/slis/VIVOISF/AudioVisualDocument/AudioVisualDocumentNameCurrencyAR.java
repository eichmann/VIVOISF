package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentNameCurrencyAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentNameCurrencyAR currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentNameCurrencyAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentNameCurrencyARIterator theAudioVisualDocument = (AudioVisualDocumentNameCurrencyARIterator)findAncestorWithClass(this, AudioVisualDocumentNameCurrencyARIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getNameCurrencyAR());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for nameCurrencyAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for nameCurrencyAR tag ");
		}
		return SKIP_BODY;
	}
}

