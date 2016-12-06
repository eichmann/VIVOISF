package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentCodeFAOSTAT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentCodeFAOSTAT currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentCodeFAOSTAT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentCodeFAOSTATIterator theAudioVisualDocument = (AudioVisualDocumentCodeFAOSTATIterator)findAncestorWithClass(this, AudioVisualDocumentCodeFAOSTATIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getCodeFAOSTAT());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for codeFAOSTAT tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for codeFAOSTAT tag ");
		}
		return SKIP_BODY;
	}
}

