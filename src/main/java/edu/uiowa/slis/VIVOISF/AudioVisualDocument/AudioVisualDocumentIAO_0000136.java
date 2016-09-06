package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentIAO_0000136 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentIAO_0000136 currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentIAO_0000136.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentIAO_0000136Iterator theAudioVisualDocumentIAO_0000136Iterator = (AudioVisualDocumentIAO_0000136Iterator)findAncestorWithClass(this, AudioVisualDocumentIAO_0000136Iterator.class);
			pageContext.getOut().print(theAudioVisualDocumentIAO_0000136Iterator.getIAO_0000136());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for IAO_0000136 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for IAO_0000136 tag ");
		}
		return SKIP_BODY;
	}
}

