package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentNameShortRUIterator theAudioVisualDocument = (AudioVisualDocumentNameShortRUIterator)findAncestorWithClass(this, AudioVisualDocumentNameShortRUIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

