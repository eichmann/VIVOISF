package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentCodeGAUL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentCodeGAUL currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentCodeGAUL.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentCodeGAULIterator theAudioVisualDocument = (AudioVisualDocumentCodeGAULIterator)findAncestorWithClass(this, AudioVisualDocumentCodeGAULIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getCodeGAUL());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for codeGAUL tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for codeGAUL tag ");
		}
		return SKIP_BODY;
	}
}

