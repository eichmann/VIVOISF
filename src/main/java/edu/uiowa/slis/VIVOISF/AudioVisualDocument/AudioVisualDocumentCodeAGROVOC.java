package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentCodeAGROVOC extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentCodeAGROVOC currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentCodeAGROVOC.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentCodeAGROVOCIterator theAudioVisualDocument = (AudioVisualDocumentCodeAGROVOCIterator)findAncestorWithClass(this, AudioVisualDocumentCodeAGROVOCIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getCodeAGROVOC());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for codeAGROVOC tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for codeAGROVOC tag ");
		}
		return SKIP_BODY;
	}
}

