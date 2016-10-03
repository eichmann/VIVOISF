package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentShortDescriptionIterator theAudioVisualDocument = (AudioVisualDocumentShortDescriptionIterator)findAncestorWithClass(this, AudioVisualDocumentShortDescriptionIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

