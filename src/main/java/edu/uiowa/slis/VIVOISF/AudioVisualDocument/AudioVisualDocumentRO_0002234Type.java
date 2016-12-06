package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentRO_0002234Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentRO_0002234Type currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentRO_0002234Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentRO_0002234Iterator theAudioVisualDocumentRO_0002234Iterator = (AudioVisualDocumentRO_0002234Iterator)findAncestorWithClass(this, AudioVisualDocumentRO_0002234Iterator.class);
			pageContext.getOut().print(theAudioVisualDocumentRO_0002234Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

