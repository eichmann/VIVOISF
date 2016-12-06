package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentGeographicFocus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentGeographicFocus currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentGeographicFocus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentGeographicFocusIterator theAudioVisualDocumentGeographicFocusIterator = (AudioVisualDocumentGeographicFocusIterator)findAncestorWithClass(this, AudioVisualDocumentGeographicFocusIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentGeographicFocusIterator.getGeographicFocus());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for geographicFocus tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for geographicFocus tag ");
		}
		return SKIP_BODY;
	}
}

