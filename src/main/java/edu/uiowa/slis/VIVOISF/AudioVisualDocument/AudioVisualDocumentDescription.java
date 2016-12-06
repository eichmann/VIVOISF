package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentDescriptionIterator theAudioVisualDocument = (AudioVisualDocumentDescriptionIterator)findAncestorWithClass(this, AudioVisualDocumentDescriptionIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for description tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for description tag ");
		}
		return SKIP_BODY;
	}
}

