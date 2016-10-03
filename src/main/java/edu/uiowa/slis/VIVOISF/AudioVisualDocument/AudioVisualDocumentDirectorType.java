package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentDirectorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentDirectorType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentDirectorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentDirectorIterator theAudioVisualDocumentDirectorIterator = (AudioVisualDocumentDirectorIterator)findAncestorWithClass(this, AudioVisualDocumentDirectorIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentDirectorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for director tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for director tag ");
		}
		return SKIP_BODY;
	}
}

