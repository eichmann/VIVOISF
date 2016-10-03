package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentIssuer extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentIssuer currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentIssuer.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentIssuerIterator theAudioVisualDocumentIssuerIterator = (AudioVisualDocumentIssuerIterator)findAncestorWithClass(this, AudioVisualDocumentIssuerIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentIssuerIterator.getIssuer());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for issuer tag ");
		}
		return SKIP_BODY;
	}
}

