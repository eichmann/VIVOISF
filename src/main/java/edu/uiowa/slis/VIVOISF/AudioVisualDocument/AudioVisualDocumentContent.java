package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentContent currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentContentIterator theAudioVisualDocument = (AudioVisualDocumentContentIterator)findAncestorWithClass(this, AudioVisualDocumentContentIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for content tag ");
		}
		return SKIP_BODY;
	}
}

