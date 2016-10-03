package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentNumberIterator theAudioVisualDocument = (AudioVisualDocumentNumberIterator)findAncestorWithClass(this, AudioVisualDocumentNumberIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for number tag ");
		}
		return SKIP_BODY;
	}
}

