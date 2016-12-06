package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentCodeUN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentCodeUN currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentCodeUN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentCodeUNIterator theAudioVisualDocument = (AudioVisualDocumentCodeUNIterator)findAncestorWithClass(this, AudioVisualDocumentCodeUNIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getCodeUN());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for codeUN tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for codeUN tag ");
		}
		return SKIP_BODY;
	}
}

