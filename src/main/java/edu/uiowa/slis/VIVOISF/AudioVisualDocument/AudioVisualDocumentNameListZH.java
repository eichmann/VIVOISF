package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentNameListZHIterator theAudioVisualDocument = (AudioVisualDocumentNameListZHIterator)findAncestorWithClass(this, AudioVisualDocumentNameListZHIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

