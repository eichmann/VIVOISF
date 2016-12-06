package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentCodeFAOTERM extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentCodeFAOTERM currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentCodeFAOTERM.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentCodeFAOTERMIterator theAudioVisualDocument = (AudioVisualDocumentCodeFAOTERMIterator)findAncestorWithClass(this, AudioVisualDocumentCodeFAOTERMIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getCodeFAOTERM());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for codeFAOTERM tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for codeFAOTERM tag ");
		}
		return SKIP_BODY;
	}
}

