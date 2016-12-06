package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentNameListRUIterator theAudioVisualDocument = (AudioVisualDocumentNameListRUIterator)findAncestorWithClass(this, AudioVisualDocumentNameListRUIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

