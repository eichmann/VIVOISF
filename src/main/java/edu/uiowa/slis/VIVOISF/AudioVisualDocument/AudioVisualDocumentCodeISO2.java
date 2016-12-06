package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentCodeISO2 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentCodeISO2 currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentCodeISO2.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentCodeISO2Iterator theAudioVisualDocument = (AudioVisualDocumentCodeISO2Iterator)findAncestorWithClass(this, AudioVisualDocumentCodeISO2Iterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getCodeISO2());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for codeISO2 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for codeISO2 tag ");
		}
		return SKIP_BODY;
	}
}

