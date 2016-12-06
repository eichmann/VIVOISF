package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentNameOfficialRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentNameOfficialRU currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentNameOfficialRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentNameOfficialRUIterator theAudioVisualDocument = (AudioVisualDocumentNameOfficialRUIterator)findAncestorWithClass(this, AudioVisualDocumentNameOfficialRUIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getNameOfficialRU());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for nameOfficialRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for nameOfficialRU tag ");
		}
		return SKIP_BODY;
	}
}

