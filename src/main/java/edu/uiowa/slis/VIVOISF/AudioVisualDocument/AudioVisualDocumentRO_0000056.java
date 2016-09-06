package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentRO_0000056 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentRO_0000056 currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentRO_0000056.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentRO_0000056Iterator theAudioVisualDocumentRO_0000056Iterator = (AudioVisualDocumentRO_0000056Iterator)findAncestorWithClass(this, AudioVisualDocumentRO_0000056Iterator.class);
			pageContext.getOut().print(theAudioVisualDocumentRO_0000056Iterator.getRO_0000056());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

