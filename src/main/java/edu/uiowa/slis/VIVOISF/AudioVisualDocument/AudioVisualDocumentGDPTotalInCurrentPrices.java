package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentGDPTotalInCurrentPrices extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentGDPTotalInCurrentPrices currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentGDPTotalInCurrentPrices.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentGDPTotalInCurrentPricesIterator theAudioVisualDocument = (AudioVisualDocumentGDPTotalInCurrentPricesIterator)findAncestorWithClass(this, AudioVisualDocumentGDPTotalInCurrentPricesIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getGDPTotalInCurrentPrices());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for GDPTotalInCurrentPrices tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for GDPTotalInCurrentPrices tag ");
		}
		return SKIP_BODY;
	}
}

