package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentBFO_0000051Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentBFO_0000051Type currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentBFO_0000051Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentBFO_0000051Iterator theAudioVisualDocumentBFO_0000051Iterator = (AudioVisualDocumentBFO_0000051Iterator)findAncestorWithClass(this, AudioVisualDocumentBFO_0000051Iterator.class);
			pageContext.getOut().print(theAudioVisualDocumentBFO_0000051Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for BFO_0000051 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for BFO_0000051 tag ");
		}
		return SKIP_BODY;
	}
}

