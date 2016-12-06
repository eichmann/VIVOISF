package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentHDINotes extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentHDINotes currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentHDINotes.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentHDINotesIterator theAudioVisualDocument = (AudioVisualDocumentHDINotesIterator)findAncestorWithClass(this, AudioVisualDocumentHDINotesIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getHDINotes());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for HDINotes tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for HDINotes tag ");
		}
		return SKIP_BODY;
	}
}

