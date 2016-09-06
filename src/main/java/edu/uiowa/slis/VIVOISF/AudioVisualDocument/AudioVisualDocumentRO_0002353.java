package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentRO_0002353 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentRO_0002353 currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentRO_0002353.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentRO_0002353Iterator theAudioVisualDocumentRO_0002353Iterator = (AudioVisualDocumentRO_0002353Iterator)findAncestorWithClass(this, AudioVisualDocumentRO_0002353Iterator.class);
			pageContext.getOut().print(theAudioVisualDocumentRO_0002353Iterator.getRO_0002353());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

