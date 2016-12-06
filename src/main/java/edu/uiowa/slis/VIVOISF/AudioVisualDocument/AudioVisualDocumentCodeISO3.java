package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentCodeISO3 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentCodeISO3 currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentCodeISO3.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentCodeISO3Iterator theAudioVisualDocument = (AudioVisualDocumentCodeISO3Iterator)findAncestorWithClass(this, AudioVisualDocumentCodeISO3Iterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getCodeISO3());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for codeISO3 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for codeISO3 tag ");
		}
		return SKIP_BODY;
	}
}

