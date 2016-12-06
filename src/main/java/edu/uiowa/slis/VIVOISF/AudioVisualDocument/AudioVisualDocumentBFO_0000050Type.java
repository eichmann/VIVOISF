package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentBFO_0000050Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentBFO_0000050Type currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentBFO_0000050Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentBFO_0000050Iterator theAudioVisualDocumentBFO_0000050Iterator = (AudioVisualDocumentBFO_0000050Iterator)findAncestorWithClass(this, AudioVisualDocumentBFO_0000050Iterator.class);
			pageContext.getOut().print(theAudioVisualDocumentBFO_0000050Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

