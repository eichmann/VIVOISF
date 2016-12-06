package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentRO_0001015 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentRO_0001015 currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentRO_0001015.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentRO_0001015Iterator theAudioVisualDocumentRO_0001015Iterator = (AudioVisualDocumentRO_0001015Iterator)findAncestorWithClass(this, AudioVisualDocumentRO_0001015Iterator.class);
			pageContext.getOut().print(theAudioVisualDocumentRO_0001015Iterator.getRO_0001015());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}

